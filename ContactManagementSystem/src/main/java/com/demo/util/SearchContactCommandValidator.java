package com.demo.util;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.demo.model.SearchCommand;

public class SearchContactCommandValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return SearchCommand.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		SearchCommand sc=(SearchCommand) target;
		String email=sc.getEmail();
		if(email==null || email.length()==0) {
			errors.rejectValue("email","errors.required", new Object[]{"Email Id"},null);
			
		}		
	}

}
