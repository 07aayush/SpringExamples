package com.bl.dependency.Object;

public class AnotherStudent {

	private  int id;
	private MathCheat cheat;

	
	public void setId(int id) {
		this.id = id;
	}

	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}

	public void startCheating() {
		cheat.cheat();
		System.out.println("hey my id is :"+id+" take and do whatever yoy want to do");

	}
}
