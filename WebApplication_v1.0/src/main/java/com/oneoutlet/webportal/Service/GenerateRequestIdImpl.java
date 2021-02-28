package com.oneoutlet.webportal.Service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneoutlet.webportal.DAO.CountTableValues;

@Service
public class GenerateRequestIdImpl implements GenerateRequestId{

	@Autowired
	private CountTableValues countTableValues;
	
	@Override
	public String generateReqNum(String serviceName,String serviceId) {
		String reqIdNumber=null;
        int count=0;
 		
        Calendar cal=Calendar.getInstance();
		int year=cal.get(Calendar.YEAR);
		
		count=countTableValues.countValue(serviceName);
		
		reqIdNumber=serviceId+year+count;
		
		return reqIdNumber;
	}

}
