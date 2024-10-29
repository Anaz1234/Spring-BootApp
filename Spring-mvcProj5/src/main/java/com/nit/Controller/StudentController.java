package com.nit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nit.DAO.StudentDAO;
import com.nit.Model.Student;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDAO studentdao;
	
	@RequestMapping("/add_student")
	public String addStudent() {
		return "add_student";
	}
	
	@RequestMapping("/getAllStudents")
	public String getAllStudents(Model model) {
		List<Student>st= studentdao.getAllStudent();
		model.addAttribute("st",st);
		return "ShowStudents";
		
	}
	
	
	
	
	@RequestMapping("/saveStudent")
	public String saveStudent(HttpServletRequest request) {
		String studID  =request.getParameter("studID");
		String studNAME  =request.getParameter("studNAME");
		String studADD  =request.getParameter("studADD");
        Student st = new Student(Integer.valueOf(studID), studNAME, studADD);
        studentdao.saveStudent(st);
		return "redirect:/getAllStudents";
	}
	
	@RequestMapping("/deleteStudent")
	public String deleteStudent(HttpServletRequest request) {
		
		String studID=request.getParameter("studID");
		studentdao.deleteStudent(Integer.valueOf(studID));
		return "redirect:/getAllStudents";
		
	}
	
	@RequestMapping("/editStudent")
	public String editStudent(HttpServletRequest request,Model model) {
		
		String studID=request.getParameter("studID");
		Student st = studentdao.getStudent(Integer.valueOf(studID));
		model.addAttribute("st",st);
		return "update_Student";
		
	}
	
	
	
	@RequestMapping("/updateStudent")
	public String updateStudent(HttpServletRequest request) {
		String studID  =request.getParameter("studID");
		String studNAME  =request.getParameter("studNAME");
		String studADD  =request.getParameter("studADD");
        Student st = new Student(Integer.valueOf(studID), studNAME, studADD);
        studentdao.updateStudent(st);
		return "redirect:/getAllStudents";
		
		
	}
	

}
