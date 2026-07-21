package com.encapsulation;

public class Student {

	private String name;
	private int rollNo;
	private float marks;
	
	
	public void setname(String name) {
		this.name = name;
		
	}
	
	public String getname() {
	    return name;
	}
	
	public void setrollNo(int rollNo) {
		this.rollNo = rollNo;
		
	}
	
	public int getrollNo() {
		return rollNo;
		
	}
	
	public void setmarks(float marks) {
		this.marks = marks;
	}
	
	public float getmarks() {
		return marks;
	}
}
