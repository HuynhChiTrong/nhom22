package com.example.nhom22.controller;

import com.example.nhom22.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/test")
    public String test() {
        return "home";
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("listcourse", courseService.GetAll());
        return "home";
    }
}