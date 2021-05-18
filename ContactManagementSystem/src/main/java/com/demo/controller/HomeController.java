package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home.do")
	public String showHome() {
		System.out.println("home controller -> show home");
		return "HomeDef";		
	}

}
