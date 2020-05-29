package com.revature.oop;

// OOP is all about the objects 
// Objects do the work in software applications (People walk, animals eat, trees grow)
// Objects have a behavior (called a method) that we ASk them to perform

// A Class is a blueprint for an object
// A Class is a template used to create objects and to define properties 
// Classes also contain instructions for how objects can be created (constructors)
// A Class, instantiates an object (Class > object)



public class Human {

	String name;
	int age;
	String hairColor;
	String superPower;
	
	// If we want to create a Human, we need to include a constructor.....
	// A default (no args constructor) constructor is created by the compiler if we don't specify one 
	
	public Human() {
		
	}
	
	public Human(String name, int age, String hairColor, String superPower) {
		super();  // the SUPER keyword inherits the properties of the parent class
		this.name = name;
		this.age = age;
		this.hairColor = hairColor;
		this.superPower = superPower;
	}
	
	public void speak() {
		//System.out.println("Hello there!");
		System.out.println("Hello there, My name is  "+ this.name);
	}
	
	public void eat() {
		System.out.println("Eating.....");
	}
	
	public void work() {
		System.out.println("Working....");
	}
}
