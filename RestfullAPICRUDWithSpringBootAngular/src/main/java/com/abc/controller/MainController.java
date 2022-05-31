package com.abc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	/*
	 * @RequestMapping("/")
	 * 
	 * @ResponseBody public String welcome() { return "abc"; }
	 * 
	 * @RequestMapping("/home") public String index() { return "index"; }
	 */
	@RequestMapping("/")
	//@ResponseBody
	public String home() {
		return "index.html";
	}
}
