package com.springcore.auto.wire;

public class Emp {
private Address Address;



public Address getAddress() {
	return Address;
}

public void setAddress(Address address) {
	Address = address;
	System.out.println("via Setter");
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

public Emp(com.springcore.auto.wire.Address address) {
	super();
	Address = address;
	System.out.println("via constructor");
}

@Override
public String toString() {
	return "Emp [Address=" + Address + "]";
}

}
