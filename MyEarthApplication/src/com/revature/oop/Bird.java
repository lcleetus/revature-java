package com.revature.oop;

public class Bird extends Animal implements Flyable{

	public Bird(int age, String color, double weight) {
		super(age, color, weight);
	}

	
	// this is an example of POLYMORPHISM because we are changing how this method behaves by overriding it
	@Override
	public void fly() {
		System.out.println("Fly ike a bird! ");
	}

	// Bird has automatically inherited the sleep() and eat() methods
	// This is because Animal is a parent class of Bird.
	
	
	
}
