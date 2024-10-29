package com.nit.DAO;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.nit.Model.Student;

public class StudentDAOImpl extends JdbcDaoSupport implements StudentDAO {
	
	String GETALL_QUERY="select * from studentdetails ";
	String INSERT_QUERY="INSERT INTO studentdetails VALUES(?,?,?) ";
	private String DELETE = "delete from studentdetails where studID=?";
	private String UPDATE = "update studentdetails set studNAME=?, studADD=? where studID=?";
 
	private RowMapper<Student> rowMapper;
	
	public void setRowMapper(RowMapper<Student> rowMapper) {
		this.rowMapper = rowMapper;
	}

	
	public List<Student> getAllStudent() {
		
		return getJdbcTemplate().query(GETALL_QUERY,rowMapper);
	}


	@Override
	public void saveStudent(Student st) {
		
		
		getJdbcTemplate().update(INSERT_QUERY, st.getStudID(), st.getStudNAME(), st.getStudADD());

		
	}
	
	
	


	@Override
	public void deleteStudent(Integer studID) {
		getJdbcTemplate().update(DELETE, studID);
	
		
	}


	
	public void updateStudent(Student st) {
		
		getJdbcTemplate().update(UPDATE,st.getStudNAME(),st.getStudADD(),st.getStudID());
	}


	@Override
	public Student getStudent(Integer studID) {
		List<Student> students=getJdbcTemplate().query(GETALL_QUERY, rowMapper);
		return students.get(0);
	}

}
