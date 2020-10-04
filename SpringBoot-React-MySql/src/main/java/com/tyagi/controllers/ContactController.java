package com.tyagi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyagi.models.Contact;
import com.tyagi.repositories.ContactRespository;

@RestController
@CrossOrigin
public class ContactController {

	@Autowired
	ContactRespository contactRepository;
	
	@GetMapping("/contacts")
	public List<Contact> getAllContacts() {
		return contactRepository.findAll();
	}
	
	@GetMapping("/contact/{id}")
	public Optional<Contact> getContactById(@PathVariable("id") int id) {
		return contactRepository.findById(id);
	}
	
	@PostMapping("/contact")
	public Contact saveContact(@RequestBody Contact contact) {
		contactRepository.save(contact);
		return contact;
	}
	
	@PutMapping("/contact/{id}")
	public Contact updateContactById(@PathVariable("id") int id, @RequestBody Contact contact){
		Optional<Contact> optionalContact = contactRepository.findById(id);
		Contact con = optionalContact.get();
		
		//checking if incoming values from body are null or not
		if(con.getName() != null) {
			con.setName(contact.getName());
		}
		if(con.getAddress() != null) {
			con.setAddress(contact.getAddress());
		}
		if(con.getCity() != null) {
			con.setCity(contact.getCity());
		}
		if(con.getPhone() != null) {
			con.setPhone(contact.getPhone());
		}
		if(con.getEmail() != null) {
			con.setEmail(contact.getEmail());
		}
		
		contactRepository.save(con);
		return con;
		
	}
	
	@DeleteMapping("contact/{id}")
	public String deleteById(@PathVariable("id") int id) {
		Optional<Contact> contact = contactRepository.findById(id);
		Contact con = contact.get();
		contactRepository.delete(con);
		
		return ("Contact with Id : " + id + " has been deleted from the database");
	}
}

