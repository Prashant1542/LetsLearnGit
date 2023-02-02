package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	
	private int empId;
	
	private String name;
	
	private Set<String> phoneNo;
	
	private List<String> address;
	
	private Map<String, String> courses;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Set<String> phoneNo) {
		this.phoneNo = phoneNo;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int empId, String name, Set<String> phoneNo, List<String> address, Map<String, String> courses) {
		super();
		this.empId = empId;
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
		this.courses = courses;
	}

	
}
