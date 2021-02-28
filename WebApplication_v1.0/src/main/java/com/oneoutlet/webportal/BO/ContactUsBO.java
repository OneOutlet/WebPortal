package com.oneoutlet.webportal.BO;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ContactUsBO {
	
	private String Request_Number;
	private String Customer_Name;
	private String mobile;
	private String email; 
	private String Issue;
	private LocalDateTime Time;
	private int status;

}
