package com.oneoutlet.webportal.Service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import com.oneoutlet.webportal.DAO.CouponCodeChecker;
import com.oneoutlet.webportal.annotation.CouponCodeValidator;

public class CouponCodeCheckerService implements ConstraintValidator<CouponCodeValidator, String> {

	@Autowired
	private CouponCodeChecker codeChecker;
	//In This we check the validity that coupon code is used or not if not used than update it to used(1)
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		int tempStatus=0;
		
		value=value.toLowerCase();
	    
		if(!value.equals("")) {
			tempStatus=codeChecker.checkStatusCouponCode(value);
			if(tempStatus==0) {
			     codeChecker.updateCouponCode(value);
			     return true;	
		   }else if(tempStatus==1)
		       	return false;
		}
		return true;
		
	}

}
