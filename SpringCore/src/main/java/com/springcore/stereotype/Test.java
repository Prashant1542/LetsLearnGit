package com.springcore.stereotype;

import org.springframework.cglib.core.HashCodeCustomizer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
	
Student student=con.getBean("student",Student.class);
//System.out.println(student.hashCode());
System.out.println(student);
Student student2=con.getBean("student",Student.class);
System.out.println(student2);
	
	}

}
