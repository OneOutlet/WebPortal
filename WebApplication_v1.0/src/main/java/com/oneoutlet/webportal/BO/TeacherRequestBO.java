package com.oneoutlet.webportal.BO;

import lombok.Data;
// CREATE TABLE REGISTER_TEACHER(ID VARCHAR(100),NAME VARCHAR(100),MOBILE_NUMBER INT,EMAIL VARCHAR(100),QUALIFICATION VARCHAR(100),EXPERIENCE INT,ADDRESS VARCHAR(100)); 

@Data
public class TeacherRequestBO {
	
	private String id;
	private String name;
	private String mobile;
	private String email; 
	private String qualification; 
	private Integer experience;
	private String address;
	private int status;

}
