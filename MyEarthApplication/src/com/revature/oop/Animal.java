package com.revature.oop;

// an ABSTRACT class can ONLY be extended --> it is meant to be a parent\
// Abstract classes can NOT be instantiated

public abstract class Animal {
	int age;
	String color;
	double weight;
	
	// Constructor
	public Animal(int age, String color, double weight) {
		super();
		this.age = age;
		this.color = color;
		this.weight = weight;
	}
	
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void sleep() {
		System.out.println("Zzz...");
	}
	
	
}
