package org.example.lesson10_springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {

    @GetMapping
    public String home(Model model) {
        model.addAttribute("messagesHome", "Welcome to Lesson 10");
        return "home";
    }
}