package com.demo.service;

import java.util.List;

import com.demo.to.ContactTO;

public interface ContactService {
	public int addContact(ContactTO cto);
	public ContactTO getContactByEmail(String email);
	public void updateContact(ContactTO cto);
	public List<ContactTO> getAllContacts();
}
