package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserConttroller {

	@RequestMapping("/show")
	public String show() {
		return "index";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView saveDate(@ModelAttribute User user) {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("user-data");
		modelAndView.addObject("user", user);    
		return modelAndView;  
	}
}
