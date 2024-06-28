package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String Home(Model model){

       System.err.println("Home page handler");
       //sending data to view
       model.addAttribute("name","Substring technoloy");
       model.addAttribute("youtube","learn code with dev");
       model.addAttribute("linkedin", "https://www.linkedin.com/in/debarjit-mohanty/");
       return "home";
    }
}
