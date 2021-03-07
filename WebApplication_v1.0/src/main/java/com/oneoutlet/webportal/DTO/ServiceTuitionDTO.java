package com.oneoutlet.webportal.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.oneoutlet.webportal.annotation.CouponCodeAvailbilityValidator;
import com.oneoutlet.webportal.annotation.CouponCodeValidator;
import com.oneoutlet.webportal.annotation.IntegerTypeCheck;

import lombok.Data;

@Data
public class ServiceTuitionDTO {
	
	@NotBlank(message = "Please Fill the Customer Name")
	private String Customer_Name;
	@NotBlank(message = "Please Fill the Mobile Number")
	@Size(min=10,max=11,message="Mobile Number Can Not more then 11")
	@IntegerTypeCheck(message = "Please enter Correct Number")
	private String mobile;
	@NotBlank(message = "Please Fill the Your Email Address")
	private String email;
	@NotBlank(message = "Please Fill the Your Class")
	private String cls;
	@NotBlank(message = "Please Fill the Your Complete Address")
	private String Address;
	@CouponCodeValidator(message ="Sorry Coupon Code is already used")
	@CouponCodeAvailbilityValidator(message = "Please Enter Valid Coupon Code")
	private String couponCode;

}
