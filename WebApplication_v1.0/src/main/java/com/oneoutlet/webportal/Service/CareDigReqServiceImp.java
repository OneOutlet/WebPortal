package com.oneoutlet.webportal.Service;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oneoutlet.common.CreateEmail;
import com.oneoutlet.webportal.BO.CareDigReqBO;
import com.oneoutlet.webportal.DAO.CareDigReqDAO;
import com.oneoutlet.webportal.DTO.CareDigReqDTO;

@Service
public class CareDigReqServiceImp implements CareDigReqService {

	@Autowired
	private CareDigReqDAO careDigReqDao;

	@Autowired
	private EmailService email;

	@Autowired
	private GenerateRequestId reqId;

	@Autowired
	private CreateEmail createEmail;

	@Override
	public int insertDataOfCareDig(CareDigReqDTO dto) {

		try {
			int count = 0; 

			String customerEmailFormat = null;

			String adminEmailFormat = null;

			String requestNumber = null;

			requestNumber = reqId.generateReqNum("CARE_DIG_REQUEST", "ReqCD");
			    
			
		
			customerEmailFormat = createEmail.generateCDCustomerEmail(dto.getName(), requestNumber);

			adminEmailFormat = createEmail.generateCareDigEmail(dto.getName(),dto.getTest(), requestNumber,
					dto.getMobile(), LocalDateTime.now(), dto.getAddress());

			CareDigReqBO bo = new CareDigReqBO();

			// Inserting Data into BO Object

			bo.setName(dto.getName());
			bo.setMobile_no(dto.getMobile());
			bo.setEmail_id(dto.getEmail());
			bo.setAddress(dto.getAddress().concat(" "+dto.getLandmark()));
			bo.setTime(LocalDateTime.now());
			bo.setTest(dto.getTest());
			bo.setReq_no(requestNumber);
			bo.setStatus(0);

			count = careDigReqDao.insertCareDigReqData(bo);
			
			if (count == 1) {
				email.sendMail(new String[] { dto.getEmail() }, "OneOutlet Diagnos Service Confirmation",
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
