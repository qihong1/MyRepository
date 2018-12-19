package com.briup.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowPageController {

	@RequestMapping(value="/")
	public String showPage1() {	
		return "index";
	}
	
	@RequestMapping(value="/{forName}")
	public String showPage(@PathVariable String forName) {
		return forName;
	}
	
}
