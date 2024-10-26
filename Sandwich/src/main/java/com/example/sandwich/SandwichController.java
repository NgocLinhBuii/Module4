package com.example.sandwich;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @RequestMapping("/save")
    public String save(@RequestParam(value = "condiment", required = false) String[] condiments, Model model) {
        if (condiments != null) {
            model.addAttribute("condiments", condiments);
        } else {
            model.addAttribute("condiments", new String[]{"Không có lựa chọn nào"});
        }
        return "result";
    }
}

