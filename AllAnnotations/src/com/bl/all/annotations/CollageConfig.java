package com.bl.all.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollageConfig {

	@Bean
	public Principal principalBean() {
		return new Principal();
	}

	@Bean
	public Collage collageBean() // collage bean -bean id
	{
		Collage collage = new Collage(); //its similar to new Pricipal()
		collage.setPrincipal(principalBean());
		collage.setTeacher(mathTeacherBean());
		return collage;
	}
	
	@Bean
	public Teacher mathTeacherBean()
	{
		return  new  MathTeacher();
	}

}
