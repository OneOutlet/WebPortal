package com.oneoutlet.webportal.BO;



import java.time.LocalDateTime;

import lombok.Data;
//CREATE TABLE  CARE_DIG_REQUEST (REQ_NO VARCHAR(100) PRIMARY KEY, NAME VARCHAR(100) NOT NULL, MOBILE_NO VARCHAR(11) NOT NULL, EMAIL_ID VARCHAR(100) NOT NULL,TEST VARCHAR(50) NOT NULL,ADDRESS VARCHAR(700) NOT NULL);

@Data
public class CareDigReqBO {
	
	private String req_no;
	private String name;
	private String mobile_no;
	private String test; 
	private String email_id; 
	private String address;
	private LocalDateTime time;
	private int status;

}
