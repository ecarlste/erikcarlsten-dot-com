package com.erikcarlsten.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String showIndexPage(Model model) {

        model.addAttribute("name", "Erik");

        return "index";
    }

}
