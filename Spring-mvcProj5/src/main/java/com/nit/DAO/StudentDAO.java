package com.nit.DAO;

import java.util.List;

import com.nit.Model.Student;

public interface StudentDAO {
	List<Student> getAllStudent();
	void saveStudent(Student st);
	void deleteStudent(Integer studID);
	
	Student getStudent(Integer studID);
	void updateStudent(Student st );

}

