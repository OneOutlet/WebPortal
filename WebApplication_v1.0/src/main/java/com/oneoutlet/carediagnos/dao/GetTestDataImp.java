package com.oneoutlet.carediagnos.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GetTestDataImp implements GetTestData{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String GETALLTESTNAME="SELECT TEST_NAME FROM CARE_DIG_TEST";
	
	@Override
	public List<String> getAllTestName() {
		
		List<String> allTestName=new ArrayList<String>();
		
		allTestName=jdbcTemplate.queryForList(GETALLTESTNAME, String.class);
		
		return allTestName;
	}
	

	
}
