package com.sathya.spring;

public class Traveller {
	private String name;
	private String email;
	private long mobile;
	Vehicle vehicle;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void startJourny()
	{
		System.out.println("Hey " + name + " welcome to travel world");
		System.out.println("ckeck your mobile number..."+mobile+ " and Email Id.."+email);
		vehicle.move();
	}

}
