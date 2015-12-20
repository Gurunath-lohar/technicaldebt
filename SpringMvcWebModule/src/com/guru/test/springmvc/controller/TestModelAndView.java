package com.guru.test.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.guru.test.spring.autoscan.User;

@Controller
public class TestModelAndView {

	// different versions of setting parameters in view model
	
	@Autowired User user;
	
	/*@RequestMapping(value="/index", method={RequestMethod.GET})
	public String getMainPage(Model modelAndView) {
		user.setFirstName("Gurunath");
		user.setLastName("Lohar");
		user.setId(263527);
		
		modelAndView.addAttribute("userObject", user);
		return "index";
	}*/
	
	/*@RequestMapping(value="/index", method={RequestMethod.GET})
	public String getMainPage(Map modelAndView) {
		user.setFirstName("Gurunath");
		user.setLastName("Lohar");
		user.setId(263527);
		
		modelAndView.put("userObject", user);
		return "index";
	}*/
	
	@RequestMapping(value="/index")
	public ModelAndView getMainPage() {
		user.setFirstName("Gurunath");
		user.setLastName("Lohar");
		user.setId(263);
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("userObject", user);
		return modelAndView;
	}
}
