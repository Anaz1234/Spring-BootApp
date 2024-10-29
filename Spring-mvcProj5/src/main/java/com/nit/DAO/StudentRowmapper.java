package com.nit.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nit.Model.Student;

public class StudentRowmapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student st= new Student();
		
		st.setStudID(rs.getInt("studID"));
		st.setStudNAME(rs.getString("studNAME"));
		st.setStudADD(rs.getString("studADD"));
		
		return st;
	}

}
