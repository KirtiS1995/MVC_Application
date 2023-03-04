package com.BikkadIt.SpringMvcFirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class GreetController {

	@GetMapping("/greetMsg")
	public String greetMsg(Model model)
	{		
		String grtMsg="Good Morning All";
		model.addAttribute("GREETMSG", grtMsg);
		return "greet";		//logical view name
	}
	
	
	
	
}
