package com.oneoutlet.webportal.DAO;

public interface CouponCodeChecker {
	
	public int checkAvailabilityOfCouponCode(String code);
	public int checkStatusCouponCode(String code);
	public int updateCouponCode(String code);

}
