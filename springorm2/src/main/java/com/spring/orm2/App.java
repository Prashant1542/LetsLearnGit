package com.spring.orm2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm2.dao.EmployeeDao;
import com.spring.orm2.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	EmployeeDao emp=context.getBean("empDao",EmployeeDao.class);
    	Employee em=new Employee(015403,"Aarav","Meerut");
    	int l=emp.insert(em);
    	System.out.println(l);
    }
}
