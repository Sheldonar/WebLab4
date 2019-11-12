package com.george.JavaWebLab4.controller;

import com.george.JavaWebLab4.model.User;
import com.george.JavaWebLab4.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.net.http.HttpClient;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/login")
    public ModelAndView getRequest(){
        //User user = new User();
        ModelAndView modelAndView = new ModelAndView("login.jsp");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("/login")
    public RedirectView postRequest(@ModelAttribute User user){
        if (userRepository.existsByLogin(user.getLogin())){
            if(userRepository.findByLogin(user.getLogin()).getPassword().equals(user.getPassword())) {
                //userRepository.save(user);
                return new RedirectView("/registered_users");
            }
            else
                return new RedirectView("/login");
        }
        else{
            userRepository.save(user);
            return new RedirectView("/registered_users");
        }
    }

    @GetMapping("/registered_users")
    public ModelAndView viewer(){
        String result = "";
        List<User> users = (List<User>) userRepository.findAll();
        for (int i = 0; i < users.size(); i++){
            result += users.get(i).toString() + "<br>";
        }
        ModelAndView modelAndView = new ModelAndView("registered_users.jsp");
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
