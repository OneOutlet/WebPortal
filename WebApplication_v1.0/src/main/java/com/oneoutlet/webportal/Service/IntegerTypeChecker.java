package com.oneoutlet.webportal.Service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.oneoutlet.webportal.annotation.IntegerTypeCheck;

public class IntegerTypeChecker implements ConstraintValidator<IntegerTypeCheck, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if (!checkInt(value))
			return false;
		else
			return true;
	}

	private boolean checkInt(String no) {
		boolean result = true;
		char[] ch = no.toCharArray();
		for (char c : ch) {
			if (!Character.isDigit(c)) {
				result = false;
				break;
			}
		}

		return result;

	}

}
