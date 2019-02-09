package com.sel.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Student stud =ctx.getBean("student",Student.class);
		stud.displayStudentInfo();
		Student stud1 = ctx.getBean("dilip",Student.class);
		stud1.displayStudentInfo();
	}
	
	
	
}
