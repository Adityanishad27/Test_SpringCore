package com.spring.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class student {
	@Value("Aditya Nishad")
	private String StudentName;
	@Value("Varanasi")
	private String StudentCity;
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentCity() {
		return StudentCity;
	}
	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}
	@Override
	public String toString() {
		return "student [StudentName=" + StudentName + ", StudentCity=" + StudentCity + "]";
	}
	
	

}
