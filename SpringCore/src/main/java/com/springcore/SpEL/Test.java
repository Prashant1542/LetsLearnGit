package com.springcore.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/SpEL/config.xml");
		Spe sp=con.getBean("spe", Spe.class);
		System.out.println(sp);
	}

}
