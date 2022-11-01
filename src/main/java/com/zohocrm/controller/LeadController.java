package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.services.ContactService;
import com.zohocrm.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;

	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value="/viewCreateLead")
	public String viewCreateLead() {
		
		return "create_lead";
	}
	
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead")Lead lead, ModelMap model) {
		leadService.saveLead(lead);
		//emailService.sendEmail(lead.getEmail(), "Welcome", "We have received inquiry");
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping("/composeEmail")
	public String composeEmail(@RequestParam("email") String email, ModelMap model) {
		model.addAttribute("email",email);
		return "compose_email";
	}
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.getOneLead(id);
		
		Contact contact = new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		contactService.saveOneContact(contact);
		leadService.deleteOneLead(lead.getId());
		
		List<Contact> contacts = contactService.listContact();
		model.addAttribute("contact", contacts);
		
		return "allContact";
	}
	@RequestMapping("/listAllLead")
	public String getAllLeads(ModelMap model) {
		List<Lead> leads = leadService.listLeads();
		model.addAttribute("leads", leads);
		
		return "findAll";
		
	}
	
	@RequestMapping("/findOneLead")
	public String findOne(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.findOneLead(id);
		model.addAttribute("lead",lead);
		return "lead_info";
	}
	
}
