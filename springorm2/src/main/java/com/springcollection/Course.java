package com.springcollection;

public class Course {
	private int month;
	private String courseName;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Course [month=" + month + ", courseName=" + courseName + "]";
	}
	
	public void init()
	{
		 System.out.println("init.......");
	}
	
	
	

}
