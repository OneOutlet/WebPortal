package com.oneoutlet.webportal.DAO;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AllServiceTable {

	@Autowired
	private SimpleJdbcInsert simplejdbcInser;

	@Lookup
	public abstract SimpleJdbcInsert getInsert();

	public int insertTableDetailData(String reqNo, String serviceName, String customerName, LocalDateTime localDateTime,
			int status) {

		try {
			
			int count = 0;

			simplejdbcInser = getInsert();

			simplejdbcInser.withTableName("Service_All");

			Map<String, Object> map = new HashMap();
			
			map.put("Request_Number", reqNo);
			map.put("Service_Name", serviceName);
			map.put("Customer_Name", customerName);
			map.put("Time", localDateTime);
			map.put("Status", status);
			
			count = simplejdbcInser.execute(map);

			return count;
			
		}catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

}
