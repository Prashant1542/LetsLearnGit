package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp emp=(Emp)context.getBean("emp1");
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());
		System.out.println(emp.getPhoneNo());
		System.out.println(emp.getCourses());
		System.out.println(emp.getPhoneNo().getClass().getName());
		System.out.println(emp.getAddress().getClass().getName());
		System.out.println(emp.getCourses().getClass().getName());

	}

}
