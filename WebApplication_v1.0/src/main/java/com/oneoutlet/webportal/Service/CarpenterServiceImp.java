package com.oneoutlet.webportal.Service;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneoutlet.common.CreateEmail;
import com.oneoutlet.webportal.BO.ServiceCarpenterBO;
import com.oneoutlet.webportal.DAO.ServiceCarpenterDAO;
import com.oneoutlet.webportal.DTO.ServiceCarpenterDTO;

@Service
public class CarpenterServiceImp implements CarpenterService {

	@Autowired
	private ServiceCarpenterDAO serviceCarpenterDAO;
	
	@Autowired
	private EmailService email;
	
	@Autowired
	private GenerateRequestId reqId;
	
	@Autowired
	private CreateEmail createEmail;
	
	
	@Override
	public int insertDataOfCarpenter(ServiceCarpenterDTO dto) {
		
			int count=0;
			
			String emailFormat=null;
			
			String requestNumber=null;

			
			requestNumber=reqId.generateReqNum("Service_Carpanter", "ReqCarp");
			
			emailFormat=createEmail.generateEmail(dto.getCustomer_Name(),requestNumber);
			
			ServiceCarpenterBO bo= new ServiceCarpenterBO();
			
			//Inserting Data into BO Object
			
			bo.setCustomer_Name(dto.getCustomer_Name());
			bo.setMobile(dto.getMobile());
			bo.setEmail(dto.getEmail());
	        bo.setAddress(dto.getAddress());
	        bo.setTime(LocalDateTime.now());
	        bo.setRequest_Number(requestNumber);
	        bo.setStatus(0);
	        
	        count=serviceCarpenterDAO.insertCarpenterData(bo);
	        
	        if(count==1) 
	              email.sendMail(dto.getEmail(), "OneOutlet Carpenter Service Confirmation", emailFormat);
			
			return count;
	}

}
