package com.projectmanager.Project.Manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/")
    public String form(Model model) {
        model.addAttribute("form", "Dick" );
        return "form";
    }
}

