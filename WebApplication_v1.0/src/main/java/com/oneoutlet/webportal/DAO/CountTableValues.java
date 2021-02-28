package com.oneoutlet.webportal.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CountTableValues {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int countValue(String tableName) {

		try {
			
			String countQuery="SELECT COUNT(*) FROM "+tableName+"";
			
			int count=0;
			
			count=jdbcTemplate.queryForObject(countQuery, Integer.class);
			
			return count;
			
		}catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
}
