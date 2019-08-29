package com.learn.io.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping("/addAlien")                           //if we send the same aid then it will update the existing records
	public String addAlien(Alien alien) {
		System.out.println(alien.toString());
		
		repo.save(alien);	
		return "home.jsp";
	}
	
	@RequestMapping("/aliens")
	@ResponseBody
	public String getAliens() {		
		return repo.findAll().toString(); ///To return the String data
	}
	
	@RequestMapping("/alien/{aid}")       //{}==> curly braces to represent Wild card
	@ResponseBody
	public String getAlien(@PathVariable("aid") int aid) {		
		return repo.findById(aid).toString(); ///To return the String data
	}
	
	@RequestMapping("/delAlien")
	public String delAlien(@RequestParam int aid) {		
		repo.deleteById(aid);
		return "home.jsp";
	}
	
}
