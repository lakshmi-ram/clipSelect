package com.cps.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CPSController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homepage(Model model, HttpServletRequest req, HttpServletResponse res) {
		return "app/index";
	}

}
