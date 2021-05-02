package com.oneoutlet.webportal.Service;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneoutlet.common.CreateEmail;
import com.oneoutlet.webportal.BO.ServiceIronWorkBO;
import com.oneoutlet.webportal.DAO.CouponCodeDAO;
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
	
	@Autowired
	private CouponCodeDAO couponCodeDAO;
	
	@Override
	public int insertDataOfIronWork(ServiceIronWorkDTO dto) {
		
			int count=0;
			
			String customerEmailFormat=null;
			
			String adminEmailFormat=null;
			
	        String requestNumber=null;
	        
            String codeApply="no";      
			
			if(!dto.getCouponCode().equals("")) {
				codeApply="Yes";
			}
            
			
			requestNumber=reqId.generateReqNum("Service_Ironwork", "ReqIRWork");
			
			customerEmailFormat=createEmail.generateCustomerEmail(dto.getCustomer_Name(),requestNumber);
			
			adminEmailFormat = createEmail.generateAdminEmail(dto.getCustomer_Name(), "IronWork", requestNumber,
					dto.getMobile(), LocalDateTime.now(), dto.getAddress().concat(" "+dto.getLandmark()),codeApply);
			
			ServiceIronWorkBO bo= new ServiceIronWorkBO();

			//Inserting Data into BO Object
			
			bo.setCustomer_Name(dto.getCustomer_Name());
			bo.setMobile(dto.getMobile());
			bo.setEmail(dto.getEmail());
	        bo.setAddress(dto.getAddress().concat(" "+dto.getLandmark()));
	        bo.setTime(LocalDateTime.now());
	        bo.setRequest_Number(requestNumber);
	        bo.setStatus(0);
	        
	        count=serviceIronWorkDAO.insertIronWorkData(bo);
	        
	        couponCodeDAO.insertCouponCodeData(requestNumber.toLowerCase(), 0);
	        
	        
	        if (count == 1) {
				email.sendMail(new String[] { dto.getEmail() }, "OneOutlet IronWork Service Confirmation",
						customerEmailFormat);
				email.sendMail(new String[] { "harsh3492@gmail.com", "arvindy8687@gmail.com","ankur2v@gmail.com","mr.vjpandey123@gmail.com" },
						"OneOutlet Service Notification", adminEmailFormat);
			}
			
			return count;
	}

}
