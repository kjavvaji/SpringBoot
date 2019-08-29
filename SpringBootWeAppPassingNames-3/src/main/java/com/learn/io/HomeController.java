package com.learn.io;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
//	@ResponseBody          //Send the Response as Data
	public String home(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String name =req.getParameter("name");
		System.out.println("hello"+name);
		//req.setAttribute and use req.getAttribute in JSP
		session.setAttribute("name",name); //setting the attribute in session and passing it to the jsp
		return "home";   //it will call that perticular jsp
		
	}
}
