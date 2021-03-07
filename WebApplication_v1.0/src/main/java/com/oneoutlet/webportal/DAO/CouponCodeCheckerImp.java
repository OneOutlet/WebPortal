package com.oneoutlet.webportal.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CouponCodeCheckerImp implements CouponCodeChecker {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String AVAILABILITY="SELECT COUNT(*) FROM Coupon_Detail WHERE Coupon_Code=?";
	
	private static final String STATUS="SELECT Status FROM Coupon_Detail WHERE Coupon_Code=?";
	
	private static final String UPDATECODE="UPDATE Coupon_Detail SET Status = ? WHERE Coupon_Code=?";
	
	
	
	@Override
	public int checkAvailabilityOfCouponCode(String code){
		int count=0;
		try {
			count =jdbcTemplate.queryForObject(AVAILABILITY, Integer.class,code);
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public int checkStatusCouponCode(String code) {
		int count=0;
		try {
		   	  count =jdbcTemplate.queryForObject(STATUS,Integer.class,code);
			 	return count;
		}catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public int updateCouponCode(String code) {
		int count=0;
		try {
			count=jdbcTemplate.update(UPDATECODE,1,code);
			return count;
		} catch (Exception e) {
			
			e.printStackTrace();
			return -1;
			
		}
	}

	
}
