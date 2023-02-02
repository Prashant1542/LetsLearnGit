package com.springcor.lifecycle;

public class Samosa {
private int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public Samosa(int price) {
	super();
	this.price = price;
}

public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}

public void hey()
{
	System.out.println("Inside init method: hey, How are you ");
}

public void bye()
{
	System.out.println("Inside destroy method: bye bye");
}

}
