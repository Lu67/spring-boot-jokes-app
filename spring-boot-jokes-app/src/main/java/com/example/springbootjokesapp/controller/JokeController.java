package com.example.springbootjokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springbootjokesapp.service.JokeService;

@Controller
public class JokeController {
	
	private JokeService jokeService;
	
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}



	@GetMapping({"/",""})
	public String showJoke(Model model) {
		String joke = jokeService.getJoke();
		model.addAttribute("joke", joke);
		
		return "chucknorris";
	}
}
