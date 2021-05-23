package com.demo.dao;

import java.util.List;

import com.demo.to.ContactTO;

public interface ContactDao {
	public int addContact(ContactTO cto);
	public ContactTO getContactByEmail(String email);
	public void updateContact(ContactTO cto);
	public List<ContactTO> getAllContacts();
}
