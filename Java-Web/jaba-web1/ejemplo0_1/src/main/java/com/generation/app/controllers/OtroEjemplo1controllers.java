package com.generation.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class OtroEjemplo1controllers {
	
		@RequestMapping(value="2", method=RequestMethod.GET)
		public String getUserForm() {
			
			return "index";
		}
	

}
