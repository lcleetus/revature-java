package com.revature.collections2;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		// 1. Create a Car Class
		// 2. Create an ArrayList to store the Car objects
		// 3. Use an "Enhanced FOR Loop* to iterate through our List of Cars
		//  Hierarchy :-----
		//   java.util.Collection > List interface > ArrayList class (create Obj)
		
		Car jeep = new Car("Jeep", "Grand Cherokee", 20000, true);
		
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(jeep);
		cars.add(new Car("Tesla", "Model S", 800000, true));
		
	
		System.out.println(cars); // prints out before we override the toString() method  : [com.revature.collections2.Car@15db9742, com.revature.collections2.Car@6d06d69c]
		// once we override the toString() method the output becomes: [Car [make=Jeep, model=Grand Cherokee, price=20000.0, automatic=true], Car [make=Tesla, model=Model S, price=800000.0, automatic=true]]
		
		// Enhanced For Loop
		// also called a For Each Method 
		for (Car c : cars) {
			System.out.println(c);
			// System.out.println("The Model is: " + c.model); // will only be accessible if the property was public 
			System.out.println("The Model is: " + c.getModel()); // will have to use the getter method once property model was set to private
			// this is an example of Encapsulation!
		}
		
		// TO DO: you can include code to check for security clearance for who is trying to access this field
		// so say only a manager can set the model of Jeep to Wrangler 
		jeep.setModel("Wrangler");
	}

}
