package com.example.final_module.controller;

import com.example.final_module.model.SanPham;
import com.example.final_module.repository.ILoaiSanPhamRepository;
import com.example.final_module.service.ISanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class SanPhamController {

    @Autowired
    private ISanPhamService iSanPhamService;

    @Autowired
    private ILoaiSanPhamRepository iLoaiSanPhamRepository;

    @GetMapping("/")
    public String showList(Model model,
                           @RequestParam(name = "page", required = false, defaultValue = "0") int page) {
        Sort sort = Sort.by("name").descending();
        Pageable pageable = PageRequest.of(page, 5, sort);
        Page<SanPham> productPage = iSanPhamService.findAll(pageable);
        model.addAttribute("list", productPage);
        return "home";
    }

    @PostMapping("/delete-san-pham")
    public String deleteProducts(@RequestParam List<Long> ids) {
        iSanPhamService.deleteSanPham(ids);
        return "redirect:/";
    }

    @GetMapping("/show-create-form")
    public String addProductForm(Model model) {
        model.addAttribute("loaiSanPhamList", iLoaiSanPhamRepository.findAll());
        model.addAttribute("sanPham", new SanPham());
        return "redirect:/show-create-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("sanPham") SanPham sanPham, Model model) {
        if (sanPham.getName() == null || sanPham.getName().isEmpty()) {
            model.addAttribute("error", "Tên sản phẩm không được để trống");
            return "create_form";
        }
        if (sanPham.getPrice() == null || sanPham.getPrice().compareTo(new BigDecimal(100000)) < 0) {
            model.addAttribute("error", "Giá sản phẩm phải lớn hơn 100.000 VND");
            return "create_form";
        }
        iSanPhamService.save(sanPham);
        return "redirect:/";
    }
}

