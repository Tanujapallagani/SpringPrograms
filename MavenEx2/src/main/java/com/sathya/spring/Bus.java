package com.sathya.spring;

public class Bus implements Vehicle{
     private int maxSpeed;
     private String busType;
     
		
	
	public int getMaxSpeed() {
		return maxSpeed;
	}



	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}



	public String getBusType() {
		return busType;
	}



	public void setBusType(String busType) {
		this.busType = busType;
	}



	@Override
	public void move() {
		System.out.println("your selected Car vehicle");
		System.out.println("Bus Type..."+busType);
		System.out.println("Max Speed..."+maxSpeed);
		
	}
	

}
