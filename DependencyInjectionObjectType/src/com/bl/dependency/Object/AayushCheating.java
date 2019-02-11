package com.bl.dependency.Object;

public class AayushCheating {

	private int id;
	private MathCheat che;
	public AayushCheating(int id, MathCheat che) {
		super();
		this.id = id;
		this.che = che;
	}
	
	public void ayuCheating()
	{
		che.cheat();
		System.out.println("hey my id is "+id+" do what ever you want to do..!");
	}
	
	
}
