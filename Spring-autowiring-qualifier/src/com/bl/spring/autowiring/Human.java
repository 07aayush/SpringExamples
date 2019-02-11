package com.bl.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;
	
	public void startPumping() {
		if(heart!=null)
		{
		heart.pump();
	}
		else
			System.out.println("you're DEAD");
	}

}
