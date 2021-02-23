package com.shaobig.languages.shizproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shaobig.languages.shizproject.services.core.MainService;

@Controller
public class MainController {
	
	@Autowired
	private MainService service;
	
	@GetMapping
	public String start(
			Model model,
			@RequestParam(defaultValue = "World") String input,
			@RequestParam(defaultValue = "esdope") String language
			) {
		
		model.addAttribute("input", input);
		model.addAttribute("output", service.translate(input, language));
		
		return "index";
	}
}