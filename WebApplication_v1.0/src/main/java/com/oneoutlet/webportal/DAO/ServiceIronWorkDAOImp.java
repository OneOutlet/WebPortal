package com.oneoutlet.webportal.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.oneoutlet.webportal.BO.ServiceIronWorkBO;

@Repository
public abstract class ServiceIronWorkDAOImp implements ServiceIronWorkDAO {

	@Autowired
	private SimpleJdbcInsert simplejdbcInser;

	@Autowired
	private AllServiceTable allSeviceTable;

	@Lookup
	public abstract SimpleJdbcInsert getInsert();
	
	@Override
	public int insertIronWorkData(ServiceIronWorkBO ironWorkBO) {
		
		try {
			
			int count = 0, countService = 0, countTable = 0;

			simplejdbcInser = getInsert();

			simplejdbcInser.withTableName("Service_Ironwork");

			BeanPropertySqlParameterSource beanPropertySqlParameterSource = new BeanPropertySqlParameterSource(
					ironWorkBO);

			countService = simplejdbcInser.execute(beanPropertySqlParameterSource);

			countTable = allSeviceTable.insertTableDetailData(ironWorkBO.getRequest_Number(),"service_ironwork",
					ironWorkBO.getCustomer_Name(), ironWorkBO.getTime(),ironWorkBO.getStatus());

			if (countService == 1 && countTable == 1)
				count = 1;

			return count;
			
		}catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
		
	}

}
