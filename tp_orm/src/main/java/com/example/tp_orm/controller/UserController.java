package com.example.tp_orm.controller;

import com.example.tp_orm.model.User;
import com.example.tp_orm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;  

    @GetMapping("/")
    public String listUsers(Model model) {
        model.addAttribute("users", userRepository.findAll()); 
        return "list";
    }

    @GetMapping("/add")
    public String addUserForm(Model model) {
        model.addAttribute("user", new User());
        return "add";
    }

    @PostMapping("/add")
    public String addUserSubmit(@ModelAttribute User user) {
        userRepository.save(user);  
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return "redirect:/";
    }
}