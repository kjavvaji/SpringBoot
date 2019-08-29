package com.learn.io.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learn.io.Repository.AlienRepo;
import com.learn.io.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("In Home");
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		System.out.println(alien.toString());
		
		repo.save(alien);	
		return "home.jsp";
		
	}
}
