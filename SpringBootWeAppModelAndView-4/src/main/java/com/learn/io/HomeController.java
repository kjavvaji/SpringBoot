package com.learn.io;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("home")
//	@ResponseBody          //Send the Response as Data
	public ModelAndView home(@RequestParam("name") String myName) {
//		HttpSession session = req.getSession();
//		String name =req.getParameter("name");
		//req.setAttribute and use req.getAttribute in JSP
//		session.setAttribute("name",name); //setting the attribute in session and passing it to the jsp

		ModelAndView mv = new ModelAndView();
		mv.addObject("name",myName);
		mv.setViewName("home");
				
		return mv;   //it will call that perticular jsp
		
	}
}
