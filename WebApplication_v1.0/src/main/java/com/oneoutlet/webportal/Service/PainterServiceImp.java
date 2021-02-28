package com.oneoutlet.webportal.Service;


import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneoutlet.common.CreateEmail;
import com.oneoutlet.webportal.BO.ServicePainterBO;
import com.oneoutlet.webportal.DAO.ServicePainterDAO;
import com.oneoutlet.webportal.DTO.ServicePainterDTO;

@Service
public class PainterServiceImp implements PainterService {

	@Autowired
	ServicePainterDAO servicePainterDAO;
	
	@Autowired
	private EmailService email;
	
	@Autowired
	private GenerateRequestId reqId;
	
	@Autowired
	private CreateEmail createEmail;
	
	
	@Override
	public int insertDataOfPainter(ServicePainterDTO dto) {
		
			int count=0;
			
			String emailFormat=null;
			
			String requestNumber=null;
			
			requestNumber=reqId.generateReqNum("Service_Painter", "ReqPaint");
			
			emailFormat=createEmail.generateEmail(dto.getCustomer_Name(),requestNumber);
			
			ServicePainterBO bo= new ServicePainterBO();

			//Inserting Data into BO Object
			
			bo.setCustomer_Name(dto.getCustomer_Name());
			bo.setMobile(dto.getMobile());
			bo.setEmail(dto.getEmail());
	        bo.setAddress(dto.getAddress());
	        bo.setTime(LocalDateTime.now());
	        bo.setRequest_Number(requestNumber);
	        bo.setStatus(0);
	        
	        count=servicePainterDAO.insertPainterData(bo);
	        
	        if(count==1)
	        	email.sendMail(dto.getEmail(), "OneOutlet Painter Service Confirmation", emailFormat);
			
			return count;
	}

}
