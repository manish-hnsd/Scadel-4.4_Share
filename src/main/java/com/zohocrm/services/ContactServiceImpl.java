package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contact;
import com.zohocrm.repositories.ContactRepositorory;

@Service

public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepositorory contactRepo;
	
	@Override
	public void saveOneContact(Contact contact) {
		contactRepo.save(contact);

	}

	@Override
	public List<Contact> listContact() {
		List<Contact> contact = contactRepo.findAll();
		return contact;
	}

	@Override
	public Contact getOneContact(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}
