package com.demo.controller;

import com.demo.pojo.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index(Model model){
        List<User> users = userService.getUsers();
        model.addAttribute("users",users);
        return "index";
    }
}
