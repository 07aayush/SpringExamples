package com.bl.loadingfrompropertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(" your config file loaded..!!");
		Student student =ctx.getBean("student",Student.class);
		student.displayStudentInfo();
	
	}

}
   