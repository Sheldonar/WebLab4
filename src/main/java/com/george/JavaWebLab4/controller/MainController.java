package com.george.JavaWebLab4.controller;

import com.george.JavaWebLab4.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.net.http.HttpClient;

@Controller
public class MainController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/login")
    public ModelAndView getRequest(){
        System.out.println("rabotaet!");
        ModelAndView modelAndView = new ModelAndView("login.jsp");
        return modelAndView;
    }
}
