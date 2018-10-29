package com.aquarius;

public class Student {
	private String name;
	private int no;
	
	public Student(String name, int no) {
		this.name = name;
		this.no = no;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setNo(int no) {
		this.no= no;
	}
	
	public int getNo() {
		return this.no;
	}	
}
