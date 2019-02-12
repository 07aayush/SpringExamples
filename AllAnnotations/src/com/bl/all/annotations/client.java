package com.bl.all.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class client {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(CollageConfig.class);
		Collage collage = ctx.getBean("collageBean", Collage.class);
		System.out.println("the clg obj create by spring is :" + collage);
		collage.test();
		((AnnotationConfigApplicationContext) ctx).close();
	}

}
