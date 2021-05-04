package com.oneoutlet.common;

import java.time.LocalDateTime;


public interface CreateEmail {

	public String generateCustomerEmail(String name, String reqNum);
	
	public String generateCDCustomerEmail(String name, String reqNum);

	public String generateAdminEmail(String requesterName, String requestName, String reqNum, String mobileNum,
			LocalDateTime time, String address,String couponCode);
	
	public String generateCareDigEmail(String requesterName, String test, String reqNum, String mobileNum,
			LocalDateTime time, String address);
	
	public String generateTeacherRequest(String requesterName, String mobileNum,String qualifiacation,Integer Exp,String address);

}
