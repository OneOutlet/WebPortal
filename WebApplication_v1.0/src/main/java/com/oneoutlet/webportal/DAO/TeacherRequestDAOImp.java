package com.oneoutlet.webportal.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import com.oneoutlet.webportal.BO.TeacherRequestBO;



@Repository
public abstract class TeacherRequestDAOImp implements TeacherRequestDAO {

	@Autowired
	private SimpleJdbcInsert simplejdbcInser;

	@Lookup
	public abstract SimpleJdbcInsert getInsert();
	
	@Override
	public int insertTeacherRequestData(TeacherRequestBO teacherRequestBO) {
		
			try {
				
				int count = 0, countService = 0;

				simplejdbcInser = getInsert();

				simplejdbcInser.withTableName("REGISTER_TEACHER");

				BeanPropertySqlParameterSource beanPropertySqlParameterSource = new BeanPropertySqlParameterSource(
						teacherRequestBO);

				countService = simplejdbcInser.execute(beanPropertySqlParameterSource);

		
				if (countService == 1)
					count = 1;

				return count;
				
			}catch(Exception e) {
				e.printStackTrace();
				return -1;
			}
		
	}

}
