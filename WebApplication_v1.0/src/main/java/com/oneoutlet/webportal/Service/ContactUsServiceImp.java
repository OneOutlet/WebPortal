package com.oneoutlet.webportal.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneoutlet.common.CreateEmail;
import com.oneoutlet.webportal.BO.ContactUsBO;
import com.oneoutlet.webportal.DAO.ContactUsDAO;
import com.oneoutlet.webportal.DTO.ContactUsDTO;

@Service
public class ContactUsServiceImp implements ContactUsService {
	
	@Autowired
    private ContactUsDAO contactUsDAO;
	
	@Autowired
	private EmailService email;
	
	@Autowired
	private GenerateRequestId reqId;
	
	@Autowired
	private CreateEmail createEmail;
	
	@Override
	public int insertDataOfContactUs(ContactUsDTO dto) {
		
		int count=0;
		
		String customerEmailFormat=null;
		
		String adminEmailFormat=null;
		
		String requestNumber=null;
		
		requestNumber=reqId.generateReqNum("Contact_US", "ReqContact");
		
		customerEmailFormat=createEmail.generateCustomerEmail(dto.getCustomer_Name(),requestNumber);
		
		adminEmailFormat = createEmail.generateAdminEmail(dto.getCustomer_Name(), "Contact Us", requestNumber,
				dto.getMobile(), LocalDateTime.now(), "NO Address Available","No");
		
		ContactUsBO bo=null;
		
		bo=new ContactUsBO();
		
		bo.setCustomer_Name(dto.getCustomer_Name());
		bo.setMobile(dto.getMobile());
		bo.setEmail(dto.getEmail());
		bo.setIssue(dto.getIssue());
		bo.setTime(LocalDateTime.now());
		bo.setRequest_Number(requestNumber);
        bo.setStatus(0);
		
		count=contactUsDAO.insertContactUsData(bo);
		
		if (count == 1) {
			email.sendMail(new String[] { dto.getEmail() }, "OneOutlet Carpenter Service Confirmation",
					customerEmailFormat);
			email.sendMail(new String[] { "harsh3492@gmail.com", "arvindy8687@gmail.com" },
					"OneOutlet Service Notification", adminEmailFormat);
		}
		
		return count;
	}

}
