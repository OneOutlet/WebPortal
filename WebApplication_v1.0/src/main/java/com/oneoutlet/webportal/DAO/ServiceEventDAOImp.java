package com.oneoutlet.webportal.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.oneoutlet.webportal.BO.ServiceEventBO;

@Repository
public abstract class ServiceEventDAOImp implements ServiceEventDAO {

	@Autowired
	private SimpleJdbcInsert simplejdbcInser;

	@Autowired
	private AllServiceTable allSeviceTable;

	@Lookup
	public abstract SimpleJdbcInsert getInsert();
	
	@Override
	public int insertEventData(ServiceEventBO eventBO) {
		
			try {
				
				int count = 0, countService = 0, countTable = 0;

				simplejdbcInser = getInsert();

				simplejdbcInser.withTableName("Service_Event");

				BeanPropertySqlParameterSource beanPropertySqlParameterSource = new BeanPropertySqlParameterSource(
						eventBO);

				countService = simplejdbcInser.execute(beanPropertySqlParameterSource);

				countTable = allSeviceTable.insertTableDetailData(eventBO.getRequest_Number(),"service_event",
						eventBO.getCustomer_Name(), eventBO.getTime(),eventBO.getStatus());

				if (countService == 1 && countTable == 1)
					count = 1;

				return count;
				
			}catch(Exception e) {
				e.printStackTrace();
				return -1;
			}
	}

}
