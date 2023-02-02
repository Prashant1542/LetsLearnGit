package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Spe {
	
@Value("#{10+9+85}")
	private int x;
	@Value("#{25+1}")
	private int y;
@Value("#{T(java.lang.Math).sqrt(121)}")
	private double z;
//@Value("#{22==22}")
private int isActive;
	
	public int getZ() {
		return (int) z;
}

public void setZ(int z) {
	this.z = z;
}

public int getIsActive() {
	return isActive;
}

public void setIsActive(int isActive) {
	this.isActive = isActive;
}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Spe [x=" + x + ", y=" + y + ", z=" + z + ", isActive=" + isActive + "]";
	}
	
	
}
