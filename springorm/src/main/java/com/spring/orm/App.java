package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;


public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
//    	Student st=new Student(2239,"Anant Bhargav","Meerut");
//    	int r=studentDao.insert(st);
//    	System.out.println(r);
//    	
//    	Student ts=new Student(2537,"Nishant Bhatt","New Delhi");
//    	int l=studentDao.insert(ts);
//    	System.out.println(l);
    	
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	
    	boolean go=true;
    	
    	while(go){
    		System.out.println("PRESS 1 for add new Student");
    		System.out.println("PRESS 2 for display all Student");
    		System.out.println("PRESS 3 for get detail of single Student");
    		System.out.println("PRESS 4 for delete Student");
    		System.out.println("PRESS 5 for add update Student");
    		System.out.println("PRESS 6 for exit");
    		
    		try {
    			int input=Integer.parseInt(br.readLine());
    			switch (input) {
				case 1:
					//add a new student
					
					break;
case 2:
	// display all student
	break;
	
case 3:
	//get single student
	break;
	
case 4:
	//delete student
	break;
	
case 5:
	//update the Student
	break;
	
case 6:
	//exit
	go=false;	
	break;
				}
    		}catch(Exception e)
    		{
    			System.out.println("Invalid Input Try with another one!!");
    			System.out.println(e.getMessage());
    		}

    	}
    }
}
