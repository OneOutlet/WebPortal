package com.oneoutlet.webportal.Service;


import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneoutlet.common.CreateEmail;
import com.oneoutlet.webportal.BO.ServicePlumberBO;
import com.oneoutlet.webportal.DAO.ServicePlumberDAO;
import com.oneoutlet.webportal.DTO.ServicePlumberDTO;

@Service
public class PlumberServiceImp implements PlumberService {

	@Autowired
	ServicePlumberDAO servicePlumberDAO;
	
	@Autowired
	private EmailService email;
	
	@Autowired
	private GenerateRequestId reqId;
	
	@Autowired
	private CreateEmail createEmail;
	
	@Override
	public int insertDataOfPlumber(ServicePlumberDTO dto) {
			
			int count=0;
			
			String emailFormat=null;
			
			String requestNumber=null;
			
			requestNumber=reqId.generateReqNum("Service_Plumber", "ReqPlum");
			
			emailFormat=createEmail.generateEmail(dto.getCustomer_Name(),requestNumber);
			
			ServicePlumberBO bo= new ServicePlumberBO();

	        //Inserting Data into BO Object
			
			bo.setCustomer_Name(dto.getCustomer_Name());
			bo.setMobile(dto.getMobile());
			bo.setEmail(dto.getEmail());
	        bo.setAddress(dto.getAddress());
	        bo.setTime(LocalDateTime.now());
	        bo.setRequest_Number(requestNumber);
	        bo.setStatus(0);
	        
	        count=servicePlumberDAO.insertPlumberData(bo);
	        
	        if(count==1)
	             email.sendMail(dto.getEmail(), "OneOutlet Plumber Service Confirmation", emailFormat);
			
			return count;
	}

}
