package com.oneoutlet.common;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

public interface CreateEmail {

	public String generateCustomerEmail(String name, String reqNum);

	public String generateAdminEmail(String requesterName, String requestName, String reqNum, String mobileNum,
			LocalDateTime time, String address);

}
