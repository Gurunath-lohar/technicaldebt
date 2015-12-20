package com.guru.test.spring.rest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.guru.test.spring.autoscan.User;

@Controller
@RequestMapping(value="/testRes")
public class TestSpringRestController {

	@Autowired User user;
	
	@RequestMapping(method = {RequestMethod.GET}, produces="application/json")
	public @ResponseBody String getServiceResponse(HttpServletRequest req, HttpServletResponse resp) {
		user.setFirstName("Gurunath");
		user.setLastName("Lohar");
		user.setId(263);
		JSONObject jsonObject = new JSONObject(user);
		return jsonObject.toString();
	}
	
}
