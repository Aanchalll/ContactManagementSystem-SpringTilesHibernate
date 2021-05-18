package com.demo.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.ContactCommand;
import com.demo.model.SearchCommand;
import com.demo.service.ContactService;
import com.demo.to.ContactTO;
import com.demo.util.ContactCommandValidator;
import com.demo.util.SearchContactCommandValidator;

@Controller
public class ContactController {
	@Autowired
	ContactCommandValidator ccvalidator;
	@Autowired
	SearchContactCommandValidator sccvalidator;
	@Autowired
	ContactService cs;
	
	@RequestMapping(value = "/addContact.do")
	public String showAddContactForm(Map<String,Object> map) {
		System.out.println("in show add contact form of contact controller");
		ContactCommand  cc=new ContactCommand();
		map.put("contactCommand",cc);
		return "AddContactDef";
	}
	
	@RequestMapping(value = "/searchContact.do")
	public String showSearchContactForm(Map<String,Object> map) {
		System.out.println("in show search contact form of contact controller");
		SearchCommand  sc=new SearchCommand();
		map.put("searchContactCommand",sc);
		return "SearchContactDef";
	}
	@RequestMapping(value="/addContactSubmit.do")
	public String addContact(@ModelAttribute("contactCommand")ContactCommand cc,Errors errors,HttpServletRequest req) {
		System.out.println("in  add contact form of contact controller");
		ccvalidator.validate(cc, errors);
		if(errors.hasErrors()) {
			return "AddContactDef";			
		}
		String fn=cc.getFname();
		String ln=cc.getLname();
		String em=cc.getEmail();
		String phone=cc.getPhone();
		ContactTO cto=new ContactTO();
		cto.setFname(fn);
		cto.setLname(ln);
		cto.setEmail(em);
		cto.setPhone(Long.parseLong(phone));
		int cid=cs.addContact(cto);
		cto.setCid(cid);
		req.setAttribute("CTO", cto);
		return "AddContactSuccessDef";		
	}
	@RequestMapping(value="/editContactSubmit.do")
	public String editContact(Map<String,Object> map,HttpSession sess) {
		System.out.println("in edit contact of contact controller");
		ContactCommand ct=new ContactCommand();
		map.put("contactCommand", ct);
		sess.setAttribute("EDIT", "TRUE");
		return "SearchResultsDef";
	}
	@RequestMapping(value="/updateContactSubmit.do")
	public String updateContact(@ModelAttribute("contactCommand") ContactCommand cc,Errors errors,HttpServletRequest req ) {
		System.out.println("contact controller update contact()");
		//do validation
		ccvalidator.validate(cc, errors);
		if(errors.hasErrors()) {
			return "SearchResultsDef";
		}
		String cid=cc.getCid();
		String fn=cc.getFname();
		String ln=cc.getLname();
		String email=cc.getEmail();
		String ph=cc.getPhone();
		//contact business service
		ContactTO to=new ContactTO(Integer.parseInt(cid), fn, ln, email, Long.parseLong(ph));
		cs.updateContact(to);
		return "UpdateContactSuccessDef";
	}
	@RequestMapping(value = "/searchContactSubmit.do")
	public String searchContact(@ModelAttribute("searchContactCommand") SearchCommand sc,Errors errors,HttpServletRequest req) {
		System.out.println("contact controller search contact()");
		sccvalidator.validate(sc, errors);
		if(errors.hasErrors()) {
			return "SearchContactDef";
			
		}
		//collect input data now
		String email=sc.getEmail();
		ContactTO cto=cs.getContactByEmail(email);
		if(cto==null) {
			req.setAttribute("NOT_FOUND", "no record found");			
		}else {
			HttpSession session=req.getSession();
			session.setAttribute("CTO", cto);
			session.setAttribute("EDIT","FALSE");
			}
		//return tiles def
		return "SearchResultsDef";
		}
	
}
