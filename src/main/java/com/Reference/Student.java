package com.Reference;

public class Student {
	private String StudentName;
	private String StudentId;
	private Address StudentAddress;
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public Address getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		StudentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", StudentId=" + StudentId + ", StudentAddress=" + StudentAddress
				+ "]";
	}
	
	

}
