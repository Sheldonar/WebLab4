package com.george.JavaWebLab4.controller;

import com.george.JavaWebLab4.model.User;
import com.george.JavaWebLab4.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.net.http.HttpClient;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/login")
    public ModelAndView getRequest(){
        List<User> users = (List<User>) userRepository.findAll();
        users.forEach(System.out::println);
        ModelAndView modelAndView = new ModelAndView("login.jsp");
        modelAndView.addObject("user", new User());
        modelAndView.addObject("users", users);
        return modelAndView;
    }
}
