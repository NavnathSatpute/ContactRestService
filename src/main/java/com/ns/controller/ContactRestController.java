package com.ns.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ns.repo.Contact;
import com.ns.repository.ContactRepository;

@RestController
@RequestMapping("/contacts-api")
public class ContactRestController {

	@Autowired
	ContactRepository contactRepository;

	@RequestMapping("/list-contacts")
	public List<Contact> getContacts() {
		return contactRepository.findAll();
	}

	@RequestMapping("/search/{id}")
	public ResponseEntity<Optional<Contact>> getContactById(@PathVariable(value = "id") Long cId) {
		return ResponseEntity.ok().body(contactRepository.findById(cId));
	}

	@PostMapping("/save-contact")
	public Contact createContact(@Valid @RequestBody Contact contact) {
		return contactRepository.save(contact);
	}

	@PutMapping("/update-contact/{id}")
	public ResponseEntity<Contact> updateContact(@PathVariable(value = "id") Long cId,
			@Valid @RequestBody Contact contactDetails) {
		Contact contact = contactRepository.findById(cId).orElse(null);
		contact.setFirstName(contactDetails.getFirstName());
		contact.setLastName(contactDetails.getLastName());
		contact.setEmail(contactDetails.getLastName());
		contact.setPhoneNumber(contactDetails.getPhoneNumber());
		contact.setStatus(contactDetails.getStatus());
		return ResponseEntity.ok(contactRepository.save(contact));
	}

	@DeleteMapping("/delete-contact/{id}")
	public Map<String, Boolean> deleteContact(@PathVariable(value = "id") Long cId) {
		Contact contact = contactRepository.findById(cId).orElse(null);
		contactRepository.delete(contact);
		HashMap<String, Boolean> response = new HashMap<>();
		response.put("isDeleted", Boolean.TRUE);
		return response;
	}

}
