 package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

		
	List<Contact> contactList = List.of(
			
			new Contact(1L, "user1@email.com", "user1", 100L),
			new Contact(2L, "user12@email.com", "user1", 100L),
			new Contact(2L, "user2@email.com", "user2", 101L),
			new Contact(3L, "user3@email.com", "user3", 102L)

			
			);
	@Override
	public List<Contact> getContacsOfUser(Long userId) {
		// TODO Auto-generated method stub
		
		return contactList.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
