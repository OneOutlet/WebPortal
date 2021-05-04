package com.oneoutlet.webportal.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import com.oneoutlet.webportal.BO.ServiceTuitionBO;

@Repository
public abstract class ServiceTuitionDAOImp implements ServiceTuitionDAO {

	@Autowired
	private SimpleJdbcInsert simplejdbcInser;

	@Autowired
	private AllServiceTable allSeviceTable;

	@Lookup
	public abstract SimpleJdbcInsert getInsert();
	
	@Override
	public int insertTuitionData(ServiceTuitionBO tuitionBO) {
		
			try {
				
				int count = 0, countService = 0, countTable = 0;

				simplejdbcInser = getInsert();

				simplejdbcInser.withTableName("Service_Tuition");

				BeanPropertySqlParameterSource beanPropertySqlParameterSource = new BeanPropertySqlParameterSource(
						tuitionBO);

				countService = simplejdbcInser.execute(beanPropertySqlParameterSource);

				countTable = allSeviceTable.insertTableDetailData(tuitionBO.getRequest_Number(),"Service_Tuition",
						tuitionBO.getCustomer_Name(), tuitionBO.getTime(),tuitionBO.getStatus());

				if (countService == 1 && countTable == 1)
					count = 1;

				return count;
				
			}catch(Exception e) {
				e.printStackTrace();
				return -1;
			}
	}

}
