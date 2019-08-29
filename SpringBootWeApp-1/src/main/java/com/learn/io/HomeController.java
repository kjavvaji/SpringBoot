package com.learn.io;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	//@ResponseBody          //Send the Response as Data
	public String home() {                   //returning string to view
		System.out.println("Printing Home in console");
		return "home.jsp";   //it will call that perticular jsp
	}
}
