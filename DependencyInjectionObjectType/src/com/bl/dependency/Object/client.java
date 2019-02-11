package com.bl.dependency.Object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Student student = ctx.getBean("stu", Student.class);
		student.cheating();

	
	}

}
   