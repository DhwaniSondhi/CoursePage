package org.practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller1 {

	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}

	@RequestMapping("/dataStructures")
	public String dataStructures() {
		return "ds";
	}

	@RequestMapping("/javaProgramming")
	public String java() {
		return "java";
	}
}
