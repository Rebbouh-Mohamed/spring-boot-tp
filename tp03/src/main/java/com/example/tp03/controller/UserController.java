package com.example.tp03.controller;

import com.example.tp03.dao.UserDao;
import com.example.tp03.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserDao userDao; 

    @GetMapping("/")
    public String listUsers(Model model) {
        model.addAttribute("users", userDao.findAll());
        return "list";
    }

    @GetMapping("/add")
    public String addUserForm(Model model) {
        model.addAttribute("user", new User());
        return "add";
    }

    @PostMapping("/add")
    public String addUserSubmit(@ModelAttribute User user) {
        userDao.save(user);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userDao.deleteById(id);
        return "redirect:/";
    }
}