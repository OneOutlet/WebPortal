package com.oneoutlet.webportal.Service;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneoutlet.common.CreateEmail;
import com.oneoutlet.webportal.BO.ServiceEventBO;
import com.oneoutlet.webportal.DAO.ServiceEventDAO;
import com.oneoutlet.webportal.DTO.ServiceEventDTO;

@Service
public class EventServiceImp implements EventService {

	@Autowired
	ServiceEventDAO serviceEventDAO;
	
	@Autowired
	private EmailService email;
	
	@Autowired
	private GenerateRequestId reqId;
	
	@Autowired
	private CreateEmail createEmail;
	
	@Override
	public int insertDataOfEvent(ServiceEventDTO dto) {
		
			int count=0;
			
			String customerEmailFormat=null;
			
			String adminEmailFormat=null;
			
            String requestNumber=null;
			
			requestNumber=reqId.generateReqNum("Service_Event", "ReqEvent");
			
			customerEmailFormat=createEmail.generateCustomerEmail(dto.getCustomer_Name(),requestNumber);
			
			adminEmailFormat = createEmail.generateAdminEmail(dto.getCustomer_Name(), "Event", requestNumber,
					dto.getMobile(), LocalDateTime.now(), dto.getAddress());
			
			ServiceEventBO bo= new ServiceEventBO();
			
			//Inserting Data into BO Object
			
			bo.setCustomer_Name(dto.getCustomer_Name());
			bo.setMobile(dto.getMobile());
			bo.setEmail(dto.getEmail());
			bo.setEvent(dto.getEvent());
	        bo.setAddress(dto.getAddress());
	        bo.setTime(LocalDateTime.now());
	        bo.setRequest_Number(requestNumber);
	        bo.setStatus(0);
	        
	        count=serviceEventDAO.insertEventData(bo);
	        
	        
	        if (count == 1) {
				email.sendMail(new String[] { dto.getEmail() }, "OneOutlet Carpenter Service Confirmation",
						customerEmailFormat);
				email.sendMail(new String[] { "harsh3492@gmail.com", "arvindy8687@gmail.com" },
						"OneOutlet Service Notification", adminEmailFormat);
			}
			
			return count;
	}

}
