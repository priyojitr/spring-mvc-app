package com.demo.myapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllers {
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("msg","msg from controller");
		return "home";
	}
}
