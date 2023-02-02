package com.spring.first;

public class First {
private int id;
private String name;
private String address;

public First(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
public First(){
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "First [id=" + id + ", name=" + name + ", address=" + address + "]";
}



}
