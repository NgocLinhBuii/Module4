package com.example.spring_boot.controller;

import com.example.spring_boot.model.Product;
import com.example.spring_boot.service.IProductService;
import com.example.spring_boot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping
    public String showList(Model model) {
        model.addAttribute("list", iProductService.findAll());
        return "home";
    }

    @GetMapping("save")
    public void save(Product product) {
        iProductService.save(product);
    }
}
