package com.guru.test.springmvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.guru.test.spring.autoscan.ComponentA;

@Controller

public class TestSpringMvcController  {
	@Autowired
	ComponentA componentA;	
	
	public void setComponentA(ComponentA componentA) {
		this.componentA = componentA;
	}

	@RequestMapping(value = "/testmvc" , method = {RequestMethod.GET})
	public void testSpringMvc(HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(componentA.getComponentB().getMessage());
	}
}
