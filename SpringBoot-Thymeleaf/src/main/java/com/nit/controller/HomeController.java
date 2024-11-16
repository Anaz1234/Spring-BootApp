package com.nit.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	 public String Hello(Model model) {
		 model.addAttribute("date", new Date());
		 
		return "home";
		 
	 }

}
