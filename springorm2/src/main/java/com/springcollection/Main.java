package com.springcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcollection/concol.xml");
		Value v=(Value)con.getBean("v");
		System.out.println(v);
		
//		Course c=(Course)con.getBean("co");
//		System.out.println(c);
	}

}
