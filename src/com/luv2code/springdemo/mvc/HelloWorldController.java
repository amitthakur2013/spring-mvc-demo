package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("")
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
	
	// functo to convert the name to upper case
	/*
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter from the html form
		String theName=request.getParameter("studentName");
		
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Yo! "+theName;
		
		// add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	*/
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(
			@RequestParam("studentName") String theName,
			Model model
			) {
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Yo! "+theName;
		
		// add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	
	} 
	
	
}
