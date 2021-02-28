package com.oneoutlet.webportal.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.oneoutlet.webportal.BO.ServicePainterBO;

@Repository
public abstract class ServicePainterDAOImp implements ServicePainterDAO {

	@Autowired
	private SimpleJdbcInsert simplejdbcInser;

	@Autowired
	private AllServiceTable allSeviceTable;

	@Lookup
	public abstract SimpleJdbcInsert getInsert();
	
	@Override
	public int insertPainterData(ServicePainterBO painterBO) {
	
		try {
			
			int count = 0, countService = 0, countTable = 0;

			simplejdbcInser = getInsert();

			simplejdbcInser.withTableName("Service_Painter");

			BeanPropertySqlParameterSource beanPropertySqlParameterSource = new BeanPropertySqlParameterSource(
					painterBO);

			countService = simplejdbcInser.execute(beanPropertySqlParameterSource);

			countTable = allSeviceTable.insertTableDetailData(painterBO.getRequest_Number(),"service_painter",
					painterBO.getCustomer_Name(), painterBO.getTime(),painterBO.getStatus());

			if (countService == 1 && countTable == 1)
				count = 1;

			return count;
			
		}catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

}
