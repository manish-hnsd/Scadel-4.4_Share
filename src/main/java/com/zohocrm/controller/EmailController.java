package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.utilities.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping("/sendEmail")
	public String sendMail(@ModelAttribute ("to") String to, 
			@RequestParam ("sub") String sub,
			@RequestParam ("body") String body) {
		emailService.sendEmail(to, sub, body);

		return "compose_email";
		
	}
}
