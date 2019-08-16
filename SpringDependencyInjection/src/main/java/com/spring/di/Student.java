package com.spring.di;

public class Student {

	private String studentName;
	private int id;
	
	

	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}

	public void display() {
		System.out.println("id=" + id + "\n" + "name=" + studentName);
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getStudentName() {
//		return studentName;
//	}
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}

}
