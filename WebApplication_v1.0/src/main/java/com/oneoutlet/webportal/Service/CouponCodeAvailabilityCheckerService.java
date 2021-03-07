package com.oneoutlet.webportal.Service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import com.oneoutlet.webportal.DAO.CouponCodeChecker;
import com.oneoutlet.webportal.annotation.CouponCodeAvailbilityValidator;

public class CouponCodeAvailabilityCheckerService implements ConstraintValidator<CouponCodeAvailbilityValidator, String> {

	@Autowired
	private CouponCodeChecker codeChecker;
	//In this we check that entered coupon code is valid or not
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
	value=value.toLowerCase();
	
		if(!value.equals("")) {
			if(codeChecker.checkAvailabilityOfCouponCode(value)==0) {
				return false;	
			}
		}
		return true;
		
	}

}
