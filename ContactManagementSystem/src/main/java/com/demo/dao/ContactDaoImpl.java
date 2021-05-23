package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.demo.entity.Contact;
import com.demo.to.ContactTO;
@Repository
public class ContactDaoImpl implements ContactDao {
	@Autowired
	HibernateTemplate template;

	@Override
	public int addContact(ContactTO cto) {
		// TODO Auto-generated method stub
		System.out.println("in add contact of contact dao impl");
		Contact ct=new Contact(cto.getFname(),cto.getLname(),cto.getEmail(),cto.getPhone());
		int cid=(Integer)template.save(ct);
		return cid;
	}

	@Override
	public ContactTO getContactByEmail(String email) {
		// TODO Auto-generated method stub
		System.out.println("in getContactByEmail of contact dao impl");
		String hql="from Contact ct where ct.email=?";
		List<Contact> contactlist=(List<Contact>)template.find(hql,email);
		ContactTO cto=null;
		if(contactlist.size() > 0) {
			Contact ct=contactlist.get(0);
			cto=new ContactTO(ct.getCid(),ct.getFname(),ct.getLname(),ct.getEmail(),ct.getPhone());
		}
		return cto;
	}

	@Override
	public void updateContact(ContactTO cto) {
		// TODO Auto-generated method stub
		System.out.println("in updateContact of contact dao impl");
		Contact ct=new Contact(cto.getCid(),cto.getFname(),cto.getLname(),cto.getEmail(),cto.getPhone());
		template.update(ct);
		
	}

	@Override
	public List<ContactTO> getAllContacts() {
		System.out.println("in getAllContacts of contact dao impl");
		String hql="from Contact";
		List<Contact> contactlist=(List<Contact>)template.find(hql);
		List<ContactTO> ctolist=new ArrayList<ContactTO>();
		for(Contact c:contactlist) {
			ctolist.add(new ContactTO(c.getCid(),c.getFname(),c.getLname(),c.getEmail(),c.getPhone()));
			}
		return ctolist;
	}
}
