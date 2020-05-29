package com.revature.practice;

public class Motorcycle extends Vehicle {
	
	String handleBarColor;

	public Motorcycle(int wheels, String motor,String handleBarColor) {
		super(wheels, motor);
		this.handleBarColor = handleBarColor;
	}

	@Override
	public void drive() {
		System.out.println("Zooming down the road on a bike!");
	}
	

}
