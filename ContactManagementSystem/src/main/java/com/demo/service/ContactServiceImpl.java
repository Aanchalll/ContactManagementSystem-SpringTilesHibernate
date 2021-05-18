package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.ContactDao;
import com.demo.to.ContactTO;
@Transactional
@Service
public class ContactServiceImpl implements ContactService{
	@Autowired
	ContactDao cdao;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public int addContact(ContactTO cto) {
		// TODO Auto-generated method stub
		return cdao.addContact(cto);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public ContactTO getContactByEmail(String email) {
		// TODO Auto-generated method stub
		return cdao.getContactByEmail(email);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateContact(ContactTO cto) {
		// TODO Auto-generated method stub
		cdao.updateContact(cto);
	}

}
