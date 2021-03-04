package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu"; //  go config it in WEB-INF/prefix/main-menu.jsp
	}
	
	// need a controller method to shoew the initial form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a method to process the html form after submit
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
}
