package com.revature.practice;

// We make this class ABSTRCT because it holds the shared properties of motorcycles, cars and tractors 
public abstract class Vehicle {
	
	int wheels;
	String motor;
	
	// Vehicle Constructor 
	public Vehicle(int wheels, String motor) {
		super();
		this.wheels = wheels;
		this.motor = motor;
	}

	
	
	public abstract void drive();
	
}
