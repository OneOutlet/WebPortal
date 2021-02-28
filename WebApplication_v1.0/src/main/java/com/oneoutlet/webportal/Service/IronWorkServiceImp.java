package com.oneoutlet.webportal.Service;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneoutlet.common.CreateEmail;
import com.oneoutlet.webportal.BO.ServiceIronWorkBO;
import com.oneoutlet.webportal.DAO.ServiceIronWorkDAO;
import com.oneoutlet.webportal.DTO.ServiceIronWorkDTO;

@Service
public class IronWorkServiceImp implements IronWorkService {

	@Autowired
	ServiceIronWorkDAO serviceIronWorkDAO;
	
	@Autowired
	private EmailService email;
	
	@Autowired
	private GenerateRequestId reqId;
	
	@Autowired
	private CreateEmail createEmail;
	
	@Override
	public int insertDataOfIronWork(ServiceIronWorkDTO dto) {
		
			int count=0;
			
			String emailFormat=null;
			
	        String requestNumber=null;
			
			requestNumber=reqId.generateReqNum("Service_Ironwork", "ReqIRWork");
			
			emailFormat=createEmail.generateEmail(dto.getCustomer_Name(),requestNumber);
			
			ServiceIronWorkBO bo= new ServiceIronWorkBO();

			//Inserting Data into BO Object
			
			bo.setCustomer_Name(dto.getCustomer_Name());
			bo.setMobile(dto.getMobile());
			bo.setEmail(dto.getEmail());
	        bo.setAddress(dto.getAddress());
	        bo.setTime(LocalDateTime.now());
	        bo.setRequest_Number(requestNumber);
	        bo.setStatus(0);
	        
	        count=serviceIronWorkDAO.insertIronWorkData(bo);
	        
	        
	        if(count==1)
	        	email.sendMail(dto.getEmail(), "OneOutlet IronWork Service Confirmation", emailFormat);
			
			return count;
	}

}
