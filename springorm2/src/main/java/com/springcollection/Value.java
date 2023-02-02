package com.springcollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Value {
private List<String> name;
private Set<Integer> id;
private Map<String, String> address;
private Course course;

public List<String> getName() {
	return name;
}
public void setName(List<String> name) {
	this.name = name;
}
public Set<Integer> getId() {
	return id;
}
public void setId(Set<Integer> id) {
	this.id = id;
}
public Map<String, String> getAddress() {
	return address;
}
public void setAddress(Map<String, String> address) {
	this.address = address;
}
public Value() {
	super();
	// TODO Auto-generated constructor stub
}

public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
@Override
public String toString() {
	return "Value [name=" + name + ", id=" + id + ", address=" + address + ", course=" + course + "]";
}
public void des()
{
	System.out.println("destroy.....");
}

}

