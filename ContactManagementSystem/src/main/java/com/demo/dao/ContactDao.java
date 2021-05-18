package com.demo.dao;

import com.demo.to.ContactTO;

public interface ContactDao {
	public int addContact(ContactTO cto);
	public ContactTO getContactByEmail(String email);
	public void updateContact(ContactTO cto);
}
