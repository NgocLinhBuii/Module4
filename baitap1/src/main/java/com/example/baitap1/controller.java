package com.example.baitap1;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/convert")
public class controller {
    @RequestMapping("/convert")
    public String convert(@RequestParam("rate") double rate,
                          @RequestParam("usd") double usd,
                          Model model) {
        double vnd = usd * rate;
        model.addAttribute("vnd", vnd);
        return "result";
    }
}
