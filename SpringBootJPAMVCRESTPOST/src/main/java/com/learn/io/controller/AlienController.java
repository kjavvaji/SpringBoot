package com.learn.io.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.io.Repository.AlienRepo;
import com.learn.io.model.Alien;


@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("In Home");
		return "home.jsp";
	}
	
	@PostMapping(path="/alien",consumes= {"application/json"})  //only Consumes json                     //if we send the same aid then it will update the existing records
	public Alien addAlien(@RequestBody Alien alien) {
		System.out.println(alien.toString());
		
		repo.save(alien);	
		return alien;
	}
	
	@RequestMapping(path="/aliens") // To restrict the output to Xml format  use ,produces= {"application/xml"}
	@ResponseBody
	public List<Alien> getAliens() {		
		return repo.findAll(); ///To return the the List data
	}
	
	@GetMapping("/alien/{aid}")       //{}==> curly braces to represent Wild card
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
