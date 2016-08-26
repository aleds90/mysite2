package com.crunchify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.crunchify.dao.UserDAO;

@RequestMapping("/")
@Controller
public class IndexController {
 
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("index");
	}
	

}