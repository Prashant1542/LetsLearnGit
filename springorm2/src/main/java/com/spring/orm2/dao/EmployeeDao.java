package com.spring.orm2.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm2.entities.Employee;

public class EmployeeDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Employee emp)
	{
		Integer i=(Integer)this.hibernateTemplate.save(emp);
		return i;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	

}
