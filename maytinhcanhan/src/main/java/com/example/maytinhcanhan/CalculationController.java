package com.example.maytinhcanhan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculationController {

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") double num1,
                            @RequestParam("num2") double num2,
                            Model model) {
        double result = num1 + num2;
        model.addAttribute("result", result);
        return "result";
    }
}