package com.oneoutlet.webportal.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.oneoutlet.webportal.Cfg.OneoutletCfg;
import com.oneoutlet.webportal.DTO.ServiceElectricianDTO;
import com.oneoutlet.webportal.Service.ElectricianServiceImp;

public class ElectricianDataInsertTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx= new AnnotationConfigApplicationContext(OneoutletCfg.class);
		
		ElectricianServiceImp service=ctx.getBean("eService", ElectricianServiceImp.class);
		
		ServiceElectricianDTO dto= new ServiceElectricianDTO();
		
		dto.setCustomer_Name("Harsh");
		dto.setMobile("11111111");
		dto.setEmail("harsh34911@gmail.com");
		dto.setAddress("Gonda");
		
		System.out.println(service.insertDataOfElectrician(dto));
		
		((AnnotationConfigApplicationContext)ctx).close();
		
	}

}
