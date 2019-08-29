package com.learn.io.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {		
		ModelAndView mv=new ModelAndView("showAlien.jsp");
		Alien alien=repo.findById(aid).orElse(new Alien());
		
		
//		System.out.println("find by tech"+repo.findByTech("Java"));
//		System.out.println("All records Greater than aid 103"+repo.findByAidGreaterThan(103));
		System.out.println("Sorted: " +repo.findByTechSorted("Java"));		
 		mv.addObject(alien);
		System.out.println(mv);
		return mv;
	}
	
	@RequestMapping("/delAlien")
	public String delAlien(@RequestParam int aid) {		
		repo.deleteById(aid);
		return "home.jsp";
	}
	
}
