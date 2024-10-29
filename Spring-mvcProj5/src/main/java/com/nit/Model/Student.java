package com.nit.Model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Student {
	
private Integer studID;
	
	@NotEmpty
	@Size(min=5,max=50)
	private String studNAME;
	
	@NotEmpty
	@Size(min = 10, max = 50)
	private String studADD;
	
	
	
	public Student(Integer studID, String studNAME, String studADD) {
		
		this.studID = studID;
		this.studNAME = studNAME;
		this.studADD = studADD;
	}



	public Student() {
		super();
	}



	
	public String toString() {
		return "Student [studID=" + studID + ", studNAME=" + studNAME + ", studADD=" + studADD + "]";
	}



	
	public Integer getStudID() {
		return studID;
	}

	public void setStudID(Integer studID) {
		this.studID = studID;
	}




	public String getStudNAME() {
		return studNAME;
	}



	public void setStudNAME(String studNAME) {
		this.studNAME = studNAME;
	}



	public String getStudADD() {
		return studADD;
	}



	
	public void setStudADD(String studADD) {
		this.studADD = studADD;
	}
	
	

}
