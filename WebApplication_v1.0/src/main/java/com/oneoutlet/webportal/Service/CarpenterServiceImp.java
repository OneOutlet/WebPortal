package com.oneoutlet.webportal.Service;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneoutlet.common.CreateEmail;
import com.oneoutlet.webportal.BO.ServiceCarpenterBO;
import com.oneoutlet.webportal.DAO.CouponCodeDAO;
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
	
	@Autowired
	private CouponCodeDAO couponCodeDAO;

	@Override
	public int insertDataOfCarpenter(ServiceCarpenterDTO dto) {

		try {
			
			int count = 0; 

			String customerEmailFormat = null;

			String adminEmailFormat = null;

			String requestNumber = null;

			requestNumber = reqId.generateReqNum("Service_Carpanter", "ReqCarp");
			
			String codeApply="no";      
			
			if(!dto.getCouponCode().equals("")) {
				codeApply="Yes";
			}
            
			customerEmailFormat = createEmail.generateCustomerEmail(dto.getCustomer_Name(), requestNumber);

			adminEmailFormat = createEmail.generateAdminEmail(dto.getCustomer_Name(), "Carpenter", requestNumber,
					dto.getMobile(), LocalDateTime.now(), dto.getAddress().concat(" "+dto.getLandmark()),codeApply);

			ServiceCarpenterBO bo = new ServiceCarpenterBO();

			// Inserting Data into BO Object

			bo.setCustomer_Name(dto.getCustomer_Name());
			bo.setMobile(dto.getMobile());
			bo.setEmail(dto.getEmail());
			bo.setAddress(dto.getAddress().concat(" "+dto.getLandmark()));
			bo.setTime(LocalDateTime.now());
			bo.setRequest_Number(requestNumber);
			bo.setStatus(0);

			count = serviceCarpenterDAO.insertCarpenterData(bo);
			
			couponCodeDAO.insertCouponCodeData(requestNumber.toLowerCase(), 0);
			

			if (count == 1) {
				email.sendMail(new String[] { dto.getEmail() }, "OneOutlet Carpenter Service Confirmation",
						customerEmailFormat);//, "arvindy8687@gmail.com","ankur2v@gmail.com","mr.vjpandey123@gmail.com"
				email.sendMail(new String[] { "harsh3492@gmail.com" },
						"OneOutlet Service Notification", adminEmailFormat);
			}

			return count;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
