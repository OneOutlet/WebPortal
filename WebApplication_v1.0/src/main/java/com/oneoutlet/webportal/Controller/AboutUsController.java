package com.oneoutlet.webportal.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AboutUsController {
	

	@RequestMapping("/aboutus")
	public String aboutus() {
		
		return "about-us";

	}
	

}
