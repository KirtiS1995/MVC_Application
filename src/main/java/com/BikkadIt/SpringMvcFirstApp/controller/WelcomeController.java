package com.BikkadIt.SpringMvcFirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

//Create bean of welcome controller
@Controller
public class WelcomeController {

	public WelcomeController() {
		super();
		System.out.println("Welcome class controller");
}
	
	@GetMapping("/welcomeMsg")
	public ModelAndView welcomeMsg()
	{
		String msg="Welcome to bikkadIT";
		ModelAndView mav= new ModelAndView();
		mav.addObject("MESSAGE", msg);
		mav.setViewName("welcome");
		
		return mav;
		
	}
	

}
