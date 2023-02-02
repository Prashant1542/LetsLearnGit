package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("firstStudent")
public class Student {

	public void study()
	{
		 System.out.println("Reading abook......");
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
