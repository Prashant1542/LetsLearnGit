package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student st=context.getBean("getStudent",Student.class);
		System.out.println(st);
		st.study();
	}

}
