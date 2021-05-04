package com.oneoutlet.webportal.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oneoutlet.common.CreateEmail;
import com.oneoutlet.webportal.BO.TeacherRequestBO;
import com.oneoutlet.webportal.DAO.TeacherRequestDAO;
import com.oneoutlet.webportal.DTO.TeacherRequestDTO;

@Service
public class TeacherRequestServiceImp implements TeacherRequestService {

	@Autowired
	private TeacherRequestDAO teacherRequestDao;

	@Autowired
	private EmailService email;

	@Autowired
	private GenerateRequestId reqId;

	@Autowired
	private CreateEmail createEmail;

	@Override
	public int insertDataOfTeacher(TeacherRequestDTO dto) {

		try {
			int count = 0; 

			String adminEmailFormat = null;

			String requestNumber = null;

			requestNumber = reqId.generateReqNum("REGISTER_TEACHER", "Teach");
			

			adminEmailFormat = createEmail.generateTeacherRequest(dto.getName(),dto.getMobile(), dto.getQualification(),
					dto.getExperience(), dto.getAddress());

			TeacherRequestBO bo=new TeacherRequestBO();

			// Inserting Data into BO Object
			
			/*
			 * private String id; 
			 * private String name; 
			 * private String mobile;
			 * private String
			 * email;
			 * private String qualification; 
			 * private Integer experience; 
			 * private
			 * String address; private int status;
			 */

			bo.setName(dto.getName());
			bo.setMobile(dto.getMobile());
			bo.setEmail(dto.getEmail());
			bo.setAddress(dto.getAddress().concat(" "+dto.getLandmark()));
			bo.setId(requestNumber);
			bo.setQualification(dto.getQualification());
			bo.setExperience(dto.getExperience());
			bo.setStatus(0);

			count = teacherRequestDao.insertTeacherRequestData(bo);
			
			if (count == 1) {
				//, "arvindy8687@gmail.com","ankur2v@gmail.com","mr.vjpandey123@gmail.com"
				email.sendMail(new String[] { "harsh3492@gmail.com", "arvindy8687@gmail.com","ankur2v@gmail.com","mr.vjpandey123@gmail.com" },
						"OneOutlet Teacher Request Notification", adminEmailFormat);
			}

			return count;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
