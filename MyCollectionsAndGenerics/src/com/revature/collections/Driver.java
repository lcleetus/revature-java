package com.revature.collections;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		// Collections Framework also called the Collections API
		
		// a collection is a group of individual objects
		// 2 problems with arrays : (1) static size (2) only 1 datatype can be stored within it
		// int[] 1, 2, 3, 4, String[] "hello", "rug", "desk";
		
		// A common solution to an array is to create an ArrayList
		
		ArrayList words = new ArrayList(); // we are implementing the Collection Framework 
		
		words.add("tiger");
		words.add("elephant");
		words.add("hello");
		words.add(32);
		words.add(42);

		System.out.println(words);
		
		// to retrieve an element use .get(); 
		System.out.println("The second element is: " + words.get(1));
		
		// we must CASTING to specify the data type that we're  and storing in a variable  
		String e = (String) words.get(1);
		int num = (int) words.get(3);
		System.out.println("Our String is: " + e);
		System.out.println("Our Number is: " + num);
		
		
		// Type safety using Generic 
		// Generic - specifying the data type that can be stored in a collection
		ArrayList<Integer> myIntegers = new ArrayList<Integer>();
		
		myIntegers.add(23);
		myIntegers.add(34);
		myIntegers.add(103);
		
		for (int i = 0; i < myIntegers.size(); i++) {
			System.out.println("The int in my ArrayList is:  " + myIntegers.get(i));
		}		
		
	
	}

}
