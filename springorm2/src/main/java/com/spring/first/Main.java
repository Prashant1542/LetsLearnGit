package com.spring.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con=new ClassPathXmlApplicationContext("com/spring/first/conf.xml");
First f=con.getBean("first",First.class);
System.out.println(f);
		
	}

}
