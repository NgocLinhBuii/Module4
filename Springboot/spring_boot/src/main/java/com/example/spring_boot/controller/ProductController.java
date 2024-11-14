package com.example.spring_boot.controller;

import com.example.spring_boot.model.Product;
import com.example.spring_boot.service.ICategoryService;
import com.example.spring_boot.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping
    public String showList(Model model,
                            @RequestParam(name = "page", required = false,defaultValue = "0")int page) //phân trang
            //phân trang trên http
    {
        Sort sort = Sort.by("name").descending();
        Pageable pageable = PageRequest.of(page,5, sort);
        Page<Product> productPage = iProductService.findAll(pageable);
        model.addAttribute("list", productPage);
        return "home";
    }

    @GetMapping("show-create-form")
    public String showCreateForm(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", iCategoryService.findAll());
        return "create_form";
    }

    @PostMapping("save")
    public String save( @ModelAttribute("product") Product product) {
        iProductService.save(product);
        return "redirect:/";
    }
}
