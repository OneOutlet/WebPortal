package com.oneoutlet.webportal.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import com.oneoutlet.webportal.BO.CareDigReqBO;



@Repository
public abstract class CareDigReqDAOImp implements CareDigReqDAO {

	@Autowired
	private SimpleJdbcInsert simplejdbcInser;

	@Autowired
	private AllServiceTable allSeviceTable;

	@Lookup
	public abstract SimpleJdbcInsert getInsert();
	
	@Override
	public int insertCareDigReqData(CareDigReqBO careDigReqBO) {
		
			try {
				
				System.out.println("CareDigReqDAOImp.insertCareDigReqData()");
				
				int count = 0, countService = 0, countTable = 0;

				simplejdbcInser = getInsert();

				simplejdbcInser.withTableName("CARE_DIG_REQUEST");

				BeanPropertySqlParameterSource beanPropertySqlParameterSource = new BeanPropertySqlParameterSource(
						careDigReqBO);

				countService = simplejdbcInser.execute(beanPropertySqlParameterSource);

				countTable = allSeviceTable.insertTableDetailData(careDigReqBO.getReq_no(),"CARE_DIG_REQUEST",
						careDigReqBO.getName(), careDigReqBO.getTime(),careDigReqBO.getStatus());

				if (countService == 1 && countTable == 1)
					count = 1;

				return count;
				
			}catch(Exception e) {
				e.printStackTrace();
				return -1;
			}
		
	}

}
