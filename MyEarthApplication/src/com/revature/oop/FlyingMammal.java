package com.revature.oop;

public class FlyingMammal extends Animal implements Flyable{

	public FlyingMammal(int age, String color, double weight) {
		super(age, color, weight);
	}
	
	public void Fly() {
		System.out.println("Soaring across the sky... ");
	}

	@Override
	public void fly() {
		System.out.println("Fly like a Mammal");		
	}

}
