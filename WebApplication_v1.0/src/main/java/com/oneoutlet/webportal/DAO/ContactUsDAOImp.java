package com.oneoutlet.webportal.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.oneoutlet.webportal.BO.ContactUsBO;

@Repository
public abstract class ContactUsDAOImp implements ContactUsDAO {

	
	@Autowired
	private SimpleJdbcInsert simplejdbcInser;
	
	@Lookup
	abstract SimpleJdbcInsert insertData(); 
	
	@Override
	public int insertContactUsData(ContactUsBO contactUsBO) {
		
		try {
			int count = 0;

			simplejdbcInser = insertData();

			simplejdbcInser.withTableName("Contact_US");

			BeanPropertySqlParameterSource beanPropertySqlParameterSource = new BeanPropertySqlParameterSource(
					contactUsBO);

			count = simplejdbcInser.execute(beanPropertySqlParameterSource);


			return count;
			
			
			  }catch(Exception e) {
				  e.printStackTrace(); 
				  return -1;
			  
			  }
			 
	}

}
