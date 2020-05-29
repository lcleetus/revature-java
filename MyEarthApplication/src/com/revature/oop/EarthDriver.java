package com.revature.oop;

public class EarthDriver {

	public static void main(String[] args) {
		// This is the only main method we are having in the entire application
		
		// We will have humans and animals doing things on Earth!
		// First we will create the blueprint (Class) for a human.
		// Then, we will create the blueprint (Class) for a animal.
		
		System.out.println("There's nobody here!");
		
		// NEW keyword is what we use to call the constructor to instantiate a new object 
		Human person1 = new Human();
		person1.eat();		
		// person1 is a variable of type Human --> this object is now stored in the HEAP
		// the reference variable "person1" points to this particular object 
		
		
		person1.name = "Bob";
		person1.age = 34;
		person1.hairColor = "brown";
		person1.superPower = "Nice Hand-writing";
		
		//Bob has an older brother
		
		Human person2 = new Human();
		person2.name = "John"; 
		person2.age = 42;
		person2.hairColor = "purple";
		person2.superPower = "Sing like a Rockstar";
		
		/**
		 * 	
		System.out.println(person2);
		System.out.println(person1);
		System.out.println(person2.hashCode()); 
		*/
		
		
		System.out.println("Person2's name is " + person2.name);
		
		Human person3 = new Human();
		System.out.println(person3.name);
		System.out.println(person3.age);
		
		Human person4 = new Human("Sally", 20, "red", "Telepathy");
		
		person4.speak();
		person1.speak();
		person3.speak();
		
		Animal thing1 = new Animal(3, "grey", 190.43);
		thing1.eat();
		
		Bird bird1 = new Bird(2, "red", 30);
		bird1.eat();
		
		Bird pigeon = new Bird(1, "greyish-blue", 2.2);
		pigeon.sleep();
		
		//Bird.fly();  //.... this makes no sense. The methods are NOT static
		// a NON-STATIC must behave on an instantiated object.\\
		
		pigeon.fly();   // only child classes can inherit methods and properties of the parent class
 		
		FlyingMammal bat = new FlyingMammal(1, "dark grey", 0.5);
		Bird parrot = new Bird(45, "green", 30.4);
		bat.fly();
		parrot.fly();
		
		
		
		
	}

}
