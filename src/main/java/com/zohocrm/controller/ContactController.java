package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entities.Contact;
import com.zohocrm.services.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/listAllContact")
	public String getAllContact(ModelMap model) {
		List<Contact> contact = contactService.listContact();
		model.addAttribute("contact", contact);
		
		return "allContact";
		
	}
	
	
}
