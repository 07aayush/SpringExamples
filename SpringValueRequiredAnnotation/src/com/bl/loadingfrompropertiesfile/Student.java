package com.bl.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;
	@Value("${student.interstedCourse}")
	private String intrestedCourse;
	@Value("${student.hobby}")
	private String hobby;

	public void displayStudentInfo() {
		System.out.println("Student Name: " + name);
		System.out.println("Student Intrested Course: " + intrestedCourse);
		System.out.println("Student Hobby: " + hobby);
	}	
}
