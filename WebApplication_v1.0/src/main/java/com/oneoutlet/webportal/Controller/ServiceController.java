package com.oneoutlet.webportal.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.oneoutlet.webportal.DTO.ContactUsDTO;
import com.oneoutlet.webportal.DTO.ServiceCarpenterDTO;
import com.oneoutlet.webportal.DTO.ServiceElectricianDTO;
import com.oneoutlet.webportal.DTO.ServiceEventDTO;
import com.oneoutlet.webportal.DTO.ServiceIronWorkDTO;
import com.oneoutlet.webportal.DTO.ServicePainterDTO;
import com.oneoutlet.webportal.DTO.ServicePlumberDTO;
import com.oneoutlet.webportal.DTO.ServiceTuitionDTO;
import com.oneoutlet.webportal.Service.CarpenterService;
import com.oneoutlet.webportal.Service.ContactUsService;
import com.oneoutlet.webportal.Service.ElectricianService;
import com.oneoutlet.webportal.Service.EventService;
import com.oneoutlet.webportal.Service.IronWorkService;
import com.oneoutlet.webportal.Service.PainterService;
import com.oneoutlet.webportal.Service.PlumberService;
import com.oneoutlet.webportal.Service.TuitionService;

@Controller
public class ServiceController {

	@Autowired
	private ElectricianService electricianService;

	@Autowired
	private CarpenterService carpenterService;

	@Autowired
	private EventService eventService;

	@Autowired
	private IronWorkService ironWorkService;

	@Autowired
	private PainterService painterService;

	@Autowired
	private PlumberService plumberService;
	
	@Autowired
	private TuitionService tuitionService;

	@Autowired
	private ContactUsService contactUsService;

	@RequestMapping({ "/", "home" })
	public String home(@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			@ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,
			@ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,
			@ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,
			@ModelAttribute("servicePainter") ServicePainterDTO servicePainter,
			@ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,
			@ModelAttribute("serviceTuition") ServiceTuitionDTO serviceTuition,
			@ModelAttribute("contactUs") ContactUsDTO contactUs) {

		try {

			return "home";

		} catch (Exception e) {

			e.printStackTrace();

			return "error";
		}

	}

	@RequestMapping(value = "/regitercarpenterservice", method = RequestMethod.POST)
	public String regitercarpenterservice(
			@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			@ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,
			@ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,
			@ModelAttribute("servicePainter") ServicePainterDTO servicePainter,
			@ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,
			@ModelAttribute("contactUs") ContactUsDTO contactUs,
			@ModelAttribute("serviceTuition") ServiceTuitionDTO serviceTuition,
			@Valid @ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,
			BindingResult resultCarpenter, Model m) {

		if (resultCarpenter.hasErrors()) {

			m.addAttribute("act", "reqCarpenter");
			return "home";

		}

		try {

			int count = 0;

			count = carpenterService.insertDataOfCarpenter(serviceCarpenter);

			if (count == 1)
				return "redirect:home?actsuccess=reqCarpenter";
			else
				return "error";

		} catch (Exception e) {

			e.printStackTrace();
			return "error";
		}

	}

	@RequestMapping(value = "/regiterelecrtonicservice", method = RequestMethod.POST)
	public String regiterelecrtonicservice(

			@ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,

			@ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,

			@ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,

			@ModelAttribute("servicePainter") ServicePainterDTO servicePainter,

			@ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,

			@ModelAttribute("contactUs") ContactUsDTO contactUs,
			
			@ModelAttribute("serviceTuition") ServiceTuitionDTO serviceTuition,

			@Valid @ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			BindingResult resultElectrician, Model m) {

		if (resultElectrician.hasErrors()) {

			m.addAttribute("act", "reqElectrician");
			return "home";

		}

		try {

			int count = 0;

			count = electricianService.insertDataOfElectrician(serviceElectrician);

			if (count == 1)
				return "redirect:home?actsuccess=reqElectrician";
			else
				return "error";

		} catch (Exception e) {

			e.printStackTrace();

			return "error";
		}

	}

	@RequestMapping(value = "/regitereventservice", method = RequestMethod.POST)
	public String regitereventservice(@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,

			@ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,

			@ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,

			@ModelAttribute("servicePainter") ServicePainterDTO servicePainter,

			@ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,

			@ModelAttribute("serviceTuition") ServiceTuitionDTO serviceTuition,
			
			@ModelAttribute("contactUs") ContactUsDTO contactUs,

			@Valid @ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent, BindingResult resultEvent, Model m) {

		if (resultEvent.hasErrors()) {

			m.addAttribute("act", "reqEvent");
			return "home";

		}
		try {

			int count = 0;

			count = eventService.insertDataOfEvent(serviceEvent);

			if (count == 1)
				return "redirect:home?actsuccess=reqEvent";
			else
				return "error";

		} catch (Exception e) {

			e.printStackTrace();

			return "error";
		}

	}

	@RequestMapping(value = "/regiterironworkservice", method = RequestMethod.POST)
	public String regiterironworkservice(@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,

			@ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,

			@ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,

			@ModelAttribute("servicePainter") ServicePainterDTO servicePainter,

			@ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,
			
			@ModelAttribute("serviceTuition") ServiceTuitionDTO serviceTuition,
			
			@ModelAttribute("contactUs") ContactUsDTO contactUs,

			@Valid @ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork, BindingResult resultIronWork,
			Model m) {

		if (resultIronWork.hasErrors()) {

			m.addAttribute("act", "reqIronWork");
			return "home";
		}

		try {

			int count = 0;

			count = ironWorkService.insertDataOfIronWork(serviceIronWork);

			if (count == 1)
				return "redirect:home?actsuccess=reqIronWork";
			else
				return "error";

		} catch (Exception e) {

			System.out.println("ServiceController.home()");

			e.printStackTrace();

			return "error";

		}

	}

	@RequestMapping(value = "/regiterpainterservice", method = RequestMethod.POST)
	public String regiterpainterservice(@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			@ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,
			@ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,
			@ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,
			@ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,
			@ModelAttribute("contactUs") ContactUsDTO contactUs,
			@ModelAttribute("serviceTuition") ServiceTuitionDTO serviceTuition,
			@Valid @ModelAttribute("servicePainter") ServicePainterDTO servicePainter, BindingResult resultPainter,
			Model m) {

		if (resultPainter.hasErrors()) {

			m.addAttribute("act", "reqPainter");
			return "home";

		}

		try {

			int count = 0;

			count = painterService.insertDataOfPainter(servicePainter);

			if (count == 1)
				return "redirect:home?actsuccess=reqPainter";

			else
				return "error";

		} catch (Exception e) {

			e.printStackTrace();

			return "error";
		}

	}

	@RequestMapping(value = "/regiterplumberservice", method = RequestMethod.POST)
	public String regiterplumberservice(@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			@ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,
			@ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,
			@ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,
			@ModelAttribute("servicePainter") ServicePainterDTO servicePainter,
			@ModelAttribute("contactUs") ContactUsDTO contactUs,
			@ModelAttribute("serviceTuition") ServiceTuitionDTO serviceTuition,
			@Valid @ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber, BindingResult resultPlumber,
			Model m) {

		if (resultPlumber.hasErrors()) {

			m.addAttribute("act", "reqPlumber");
			return "home";

		}

		try {

			int count = 0;

			count = plumberService.insertDataOfPlumber(servicePlumber);

			if (count == 1)
				return "redirect:home?actsuccess=reqPlumber";
			else
				return "error";

		} catch (Exception e) {

			System.out.println("ServiceController.home()");

			e.printStackTrace();

			return "error";
		}

	}

	@RequestMapping(value = "/contactus", method = RequestMethod.POST)
	public String contactus(@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			@ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,
			@ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,
			@ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,
			@ModelAttribute("servicePainter") ServicePainterDTO servicePainter,
			@ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,
			@ModelAttribute("serviceTuition") ServiceTuitionDTO serviceTuition,
			@Valid @ModelAttribute("contactUs") ContactUsDTO contactUs, BindingResult resultContactUs, Model m) {

		if (resultContactUs.hasErrors()) {

			m.addAttribute("act", "reqContactUs");
			return "home";

		}
			  try {
		  
		  int count=0;
		  
		  count=contactUsService.insertDataOfContactUs(contactUs);
		
		  if(count==1)
			  return "redirect:home?actsuccess=reqContactUs";
		  
		  else 
			  return "error";
		  
		  
		  } catch (Exception e) {
		  
		  System.out.println("ServiceController.home()");
		  
		  e.printStackTrace();
		  
		  return "error"; }
		  
		 

	}
	
	
	@RequestMapping(value = "/regitertuitionservice", method = RequestMethod.POST)
	public String regitertuitionservice(
			@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			@ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,
			@ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,
			@ModelAttribute("servicePainter") ServicePainterDTO servicePainter,
			@ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,
			@ModelAttribute("contactUs") ContactUsDTO contactUs,
			@ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,
			@Valid @ModelAttribute("serviceTuition") ServiceTuitionDTO serviceTuition,
			BindingResult resultTuition, Model m) {

		if (resultTuition.hasErrors()) {

			m.addAttribute("act", "reqTution");
			return "home";

		}

		try {

			int count = 0;

			count = tuitionService.insertDataOfTuition(serviceTuition);

			if (count == 1)
				return "redirect:home?actsuccess=reqTution";
			else
				return "error";

		} catch (Exception e) {

			e.printStackTrace();

			return "error";
		}

	}
	

	// This method is responsible for handling 500 Error
	@RequestMapping({ "error" })
	public String eror(@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			@ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,
			@ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,
			@ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,
			@ModelAttribute("servicePainter") ServicePainterDTO servicePainter,
			@ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,
			@ModelAttribute("serviceTuition") ServiceTuitionDTO serviceTuition,
			@ModelAttribute("contactUs") ContactUsDTO contactUs) {

		return "error";
	}

}
