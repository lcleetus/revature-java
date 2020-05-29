package com.revature.practice;

// Both access modifiers and non-access modifiers are applicable to classes, methods and properties
// public, default, private, protected = access modifiers
// abstract, static, final, synchronized = non-access modifier
// void is a keyword - it determines the return type 

public class Tractor extends Vehicle{
	
	double sizeOfScooperInCubicFeet;

	// Overriding a method is an example of POLYMORPHISM
	// Same method name different behavior
	
	@Override
	public void drive() {
		System.out.println("Just picking up some dirt!");		
	}
	
	public Tractor(int wheels, String motor, double sizeOfScooperInCubicFeet) {
		super(wheels, motor);
		this.sizeOfScooperInCubicFeet = sizeOfScooperInCubicFeet;
	}
	
}
