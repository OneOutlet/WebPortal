package com.oneoutlet.webportal.Controller;


import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.oneoutlet.webportal.DTO.ContactUsDTO;
import com.oneoutlet.webportal.DTO.ServiceCarpenterDTO;
import com.oneoutlet.webportal.DTO.ServiceElectricianDTO;
import com.oneoutlet.webportal.DTO.ServiceEventDTO;
import com.oneoutlet.webportal.DTO.ServiceIronWorkDTO;
import com.oneoutlet.webportal.DTO.ServicePainterDTO;
import com.oneoutlet.webportal.DTO.ServicePlumberDTO;
import com.oneoutlet.webportal.DTO.ServiceTuitionDTO;
import com.oneoutlet.webportal.DTO.TeacherRequestDTO;
import com.oneoutlet.webportal.Service.TeacherRequestService;


@Controller
public class RequestPartnerController {

	@Autowired
	private TeacherRequestService teacherRequestService;
	
	@RequestMapping("/teacher-req")
	public String home(@ModelAttribute("teacher") TeacherRequestDTO teacher) {
		
		return "teacher-add";

	}
	
	@PostMapping("/teacherRegister")
	public String register(@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			@ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,
			@ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,
			@ModelAttribute("servicePainter") ServicePainterDTO servicePainter,
			@ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,
			@ModelAttribute("contactUs") ContactUsDTO contactUs,
			@ModelAttribute("serviceTuition") ServiceTuitionDTO serviceTuition,
			@ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,
			@Valid @ModelAttribute("teacher") TeacherRequestDTO teacher,BindingResult resultTeacher, Model m) {
		
		if (resultTeacher.hasErrors()) {
        
			m.addAttribute("act", "reqTeacher");
			return "teacher-add";

		}

		try {
			
			int count = 0;

			count = teacherRequestService.insertDataOfTeacher(teacher);

			if (count == 1) {
				return "redirect:/home?actsuccess=reqTeacher";
				}
			else
				return "error";

		} catch (Exception e) {

			e.printStackTrace();
			return "error";
		}

	}
	
	
	
}
