package com.sammy.todoproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping ("/todont")
    public String homePage(Model model){
        model.addAttribute("task", new Task());
        return "index";
    }
}
