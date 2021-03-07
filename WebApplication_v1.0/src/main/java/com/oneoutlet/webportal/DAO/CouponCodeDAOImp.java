package com.oneoutlet.webportal.DAO;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public abstract class CouponCodeDAOImp implements CouponCodeDAO {

	@Autowired
	private SimpleJdbcInsert jdbcInsert;
	
	@Lookup
	abstract SimpleJdbcInsert insertData();
	
	@Override
	public int insertCouponCodeData(String couponCode, int status) {
		try {
			
			int count=0;
			jdbcInsert=insertData();
			jdbcInsert.setTableName("Coupon_Detail");
			Map<String,Object> map=new HashMap<String, Object>();
			map.put("Coupon_code", couponCode);
			map.put("Status", status);
			
			count=jdbcInsert.execute(map);
			
			return count;
			
		} catch (Exception e) {
			 e.printStackTrace(); 
			  return -1;
		}
	}

}
