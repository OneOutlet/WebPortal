package com.oneoutlet.webportal.Service;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneoutlet.common.CreateEmail;
import com.oneoutlet.webportal.BO.ServiceElectricianBO;
import com.oneoutlet.webportal.DAO.ServiceElectricianDAO;
import com.oneoutlet.webportal.DTO.ServiceElectricianDTO;

@Service("eService")
public class ElectricianServiceImp implements ElectricianService {

	@Autowired
	ServiceElectricianDAO electricanDAO;
	
	@Autowired
	private EmailService email;
	
	@Autowired
	private GenerateRequestId reqId;
	
	@Autowired
	private CreateEmail createEmail;
	
	
	
	@Override
	public int insertDataOfElectrician(ServiceElectricianDTO dto) {
	
		int count=0;
		
		String emailFormat=null;
		
		String requestNumber=null;
		
		requestNumber=reqId.generateReqNum("Service_Electrician", "ReqElec");
		
		emailFormat=createEmail.generateEmail(dto.getCustomer_Name(),requestNumber);
			
		ServiceElectricianBO bo= new ServiceElectricianBO();
		//Inserting Data into BO Object
		
		bo.setCustomer_Name(dto.getCustomer_Name());
		bo.setMobile(dto.getMobile());
		bo.setEmail(dto.getEmail());
        bo.setAddress(dto.getAddress());
        bo.setTime(LocalDateTime.now());
        bo.setRequest_Number(requestNumber);
        bo.setStatus(0);
        
        
        count=electricanDAO.insertElectricianData(bo);
        
        if(count==1)
             email.sendMail(dto.getEmail(), "OneOutlet Electrician Service Confirmation", emailFormat);
		
		return count;
	}

}
