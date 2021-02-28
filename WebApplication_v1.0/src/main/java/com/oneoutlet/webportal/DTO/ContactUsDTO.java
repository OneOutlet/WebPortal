package com.oneoutlet.webportal.DTO;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.oneoutlet.webportal.annotation.IntegerTypeCheck;

import lombok.Data;

@Data
public class ContactUsDTO {
	
	@NotBlank(message = "Please Fill the Your Name")
	private String Customer_Name;
	
	@NotBlank(message = "Please Fill the Your  Mobile Number")
	@Size(min=10,max=11,message="Mobile Number Can Not more then 11 and less then 10")
	@IntegerTypeCheck(message = "Please enter Correct Number")
	private String mobile;
	
	@NotBlank(message = "Please Fill the Your Email Address")
	private String email;
	
	@NotBlank(message = "Please Fill the Your Issue")
	private String Issue;

}
