package com.learn.io.controller;


import java.util.List;
import java.util.Optional;

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
	
	@RequestMapping(path="/aliens") // To restrict the output to Xml format  use ,produces= {"application/xml"}
	@ResponseBody
	public List<Alien> getAliens() {		
		return repo.findAll(); ///To return the the List data
	}
	
	@RequestMapping("/alien/{aid}")       //{}==> curly braces to represent Wild card
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {		
		return repo.findById(aid); ///To return the Optional List data
	}
	
//	@RequestMapping("/delAlien")
//	public String delAlien(@RequestParam int aid) {		
//		repo.deleteById(aid);
//		return "home.jsp";
//	}
	
}
