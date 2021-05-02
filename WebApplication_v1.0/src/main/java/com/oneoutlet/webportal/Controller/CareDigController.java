package com.oneoutlet.webportal.Controller;



import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.oneoutlet.carediagnos.dao.GetTestDataImp;
import com.oneoutlet.webportal.DTO.CareDigReqDTO;
import com.oneoutlet.webportal.DTO.ContactUsDTO;
import com.oneoutlet.webportal.DTO.ServiceCarpenterDTO;
import com.oneoutlet.webportal.DTO.ServiceElectricianDTO;
import com.oneoutlet.webportal.DTO.ServiceEventDTO;
import com.oneoutlet.webportal.DTO.ServiceIronWorkDTO;
import com.oneoutlet.webportal.DTO.ServicePainterDTO;
import com.oneoutlet.webportal.DTO.ServicePlumberDTO;
import com.oneoutlet.webportal.DTO.ServiceTuitionDTO;
import com.oneoutlet.webportal.Service.CareDigReqService;


@Controller
public class CareDigController {
	
	@Autowired
	private CareDigReqService careDigService;
	
	@Autowired
	private GetTestDataImp getTestData;

	
	@RequestMapping("/carediagnos")
	public String home(@ModelAttribute("careDig") CareDigReqDTO careDig) {
		
		return "care-diagnos";

	}
	
	@PostMapping("/cDRegister")
	public String register(@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			@ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,
			@ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,
			@ModelAttribute("servicePainter") ServicePainterDTO servicePainter,
			@ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,
			@ModelAttribute("contactUs") ContactUsDTO contactUs,
			@ModelAttribute("serviceTuition") ServiceTuitionDTO serviceTuition,
			@ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,
			@Valid @ModelAttribute("careDig") CareDigReqDTO careDig,BindingResult resultCD, Model m) {
		
		if (resultCD.hasErrors()) {
        
			m.addAttribute("act", "reqCD");
			return "care-diagnos";

		}

		try {
			
			int count = 0;

			count = careDigService.insertDataOfCareDig(careDig);

			if (count == 1) {
				return "redirect:/home?actsuccess=reqCD";
				}
			else
				return "error";

		} catch (Exception e) {

			e.printStackTrace();
			return "error";
		}

	}
	
	@ModelAttribute("cdTest")
	public List<String> getTestName() {
		
		List<String> getTestAllName=getTestData.getAllTestName();
		
		
		
		return getTestAllName;
	}
	
}
