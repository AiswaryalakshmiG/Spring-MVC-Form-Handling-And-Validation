package com.example.SpringMVCProject.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.SpringMVCProject.model.User;

@Controller
public class UserController {
@GetMapping("/register")
public String shoeForm(Model model) {
	model.addAttribute("user", new User());
	return "register";
}

@PostMapping("/register")
public String submitForm(@Valid @ModelAttribute("user") User user, BindingResult result ) {
	if (result.hasErrors()) {
        return "register";
	}
	return "index";
}
}
