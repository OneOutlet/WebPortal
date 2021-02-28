package com.oneoutlet.common;

import org.springframework.validation.Errors;

import com.oneoutlet.webportal.VO.ServiceCarpenterVO;

public class Validator implements org.springframework.validation.Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return ServiceCarpenterVO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub

	}

}
