package com.demo.util;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.demo.model.ContactCommand;

public class ContactCommandValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return ContactCommand.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ContactCommand cc=(ContactCommand) target;
		String fn=cc.getFname();
		String ln=cc.getLname();
		String email=cc.getEmail();
		String phone=cc.getPhone();
		if(fn==null || fn.length()==0) {
			errors.rejectValue("fname","errors.required", new Object[]{"First Name"},null);
			
		}
		if(ln==null || ln.length()==0) {
			errors.rejectValue("lname","errors.required", new Object[]{"Last Name"},null);
			
		}
		if(email==null || email.length()==0) {
			errors.rejectValue("email","errors.required", new Object[]{"Email Id"},null);
			
		}
		if(phone==null || phone.length()==0) {
			errors.rejectValue("phone","errors.required", new Object[]{"Phone Number"},null);
			
		}		
		
	}

}
