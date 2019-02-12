package com.bl.all.annotations;

public class Collage {

	private Principal principal;
	
	private Teacher teacher;
	
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setPrincipal(Principal principal) { //setter injection
		this.principal = principal;
	}


	public void test()
	{
		principal.principalinfo();
		teacher.teach();
		System.out.println("testing this class method");
		
	}


	
	
}
