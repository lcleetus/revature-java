package com.revature.practice;

public class Car extends Vehicle{

	boolean sunroof;
	String steroBrand; 
	// since Car extends Vehicle, it has
	// int wheels;
	// String motor; ... we don't see this because it's abstracted away.
	
	

	//an annotation specifies an important aspect pertaining to the following code 
	// Overriding a method is an example of POLYMORPHISM
	// Same method name different behavior
	@Override
	public void drive() {
		System.out.println("Drives smooothly along the road in a car.");
				
	}
	
	// another example of Polymorphism is overloading
		public void drive (int miles) {
			System.out.printf("The car just drove %d miles", miles);
			System.out.println();
		}
		
		public Car(int wheels, String motor, boolean sunroof, String steroBrand) {
			super(wheels, motor);    // This is an example of inheritance! 
			this.sunroof = sunroof;
			this.steroBrand = steroBrand;
		}	
	

}
