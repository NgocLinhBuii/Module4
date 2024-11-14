package com.example.spring_boot.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookie/")
public class CookieController {
    @GetMapping("set-cookie")
    public String setCookie(HttpServletResponse response) {
        Cookie c = new Cookie("name", "C0324");
        c.setMaxAge(60);
        response.addCookie(c);
        return null;
    }

    @GetMapping("get-cookie")
    public String getCookie(@CookieValue(name = "name") String name) {
        System.out.println(name);
        return null;
    }
}
