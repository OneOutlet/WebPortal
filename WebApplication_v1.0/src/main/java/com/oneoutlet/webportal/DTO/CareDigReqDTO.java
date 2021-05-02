package com.oneoutlet.webportal.DTO;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import com.oneoutlet.webportal.annotation.IntegerTypeCheck;

import lombok.Data;

@Data
public class CareDigReqDTO {
	
	@NotBlank(message = "Please Fill the Customer Name")
	private String name;
	@NotBlank(message = "Please Fill the Mobile Number")
	@Size(min=10,max=11,message="Mobile Number Can Not more then 11")
	@IntegerTypeCheck(message = "Please enter Correct Number")
	private String mobile;
	@NotBlank(message = "Please Fill the Your Email Address")
	private String email;
	@NotBlank(message = "Please Fill the Your Test")
	private String test;
	@NotBlank(message = "Please Fill the Your Complete Address")
	private String Address;
	private String landmark;

}