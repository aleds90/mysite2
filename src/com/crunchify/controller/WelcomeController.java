package com.crunchify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.crunchify.dao.*;
import com.crunchify.model.*;
 
@RequestMapping("/welcome")
@Controller
public class WelcomeController {
 
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("")
	public ModelAndView helloWorld() {
		
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam String username, @RequestParam  String password) {
		
		System.out.println("Username: "+username+" Password:"+password);
		boolean check = userDAO.login(username, password);
		
		if(check){
			return new ModelAndView("welcome", "username", username);
		}
		
		return new ModelAndView("index");
	}
}