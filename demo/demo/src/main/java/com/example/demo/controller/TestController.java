package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller //anotation
@RequestMapping("/") //url handle mapping
public class TestController {

    @Autowired
    private IStudentService iStudentService;

    @GetMapping //http get <a>, link, form GET lấy dữ liệu, hiển thị form
    public String showHomePage(Model model) {
        //Model, ModelAndView, ModelMap
        List<Student> list = iStudentService.findAll();
        model.addAttribute("list", list);
        return "home";
    }

    @GetMapping("show-create-form")
    public String showCreateForm(Model model) {
        model.addAttribute("student", new Student());
        return "create_form";
    }

    @PostMapping("save-student") //http post: form post thêm mới, update
    public String save(@ModelAttribute("student") Student student, RedirectAttributes redirectAttributes){
        iStudentService.save(student);
        redirectAttributes.addFlashAttribute("msg", "Thêm mới thành công!!!");
        return "redirect:/"; // <=> respone.sendRedirect
    }

//    @PutMapping //http put update toàn bộ
//    @PatchMapping //http patch update 1 vài trường
//    @DeleteMapping //http delete

    @GetMapping("show-update-form/{id:^[0-9]+$}")
    public String showUpdateForm(@PathVariable("id") int id) {
        return "update_form";
    }
}
