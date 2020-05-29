package com.revature.basics;

import java.util.Arrays;

public class LearningArrays {

	public static void main(String[] args) {
		// int or String stores single values 
		// Arrays store multiple values
		
		/**		
		 * An array is a way to store a collection of elements
		 * An Array can only store one type of data
		 *  
         */
		
		int[] values = new int[10];
		// 1. Declare that the array only stores integers 
		// 2. We initialize the array with a certain capacity
		
		
		// Java uses Zero-Indexing
		// _0_  _1_  _2_  _3_  _4_  _5_  _6_  _7_  _8_  _9_
		System.out.println("This is the first element: " + values[0]);
		System.out.println("This is the second element: " + values[1]);
		
		// The default value of an integer array is 0 
		
		//Initialize the array:
		
		values[0] = 1;
		values[1] = 2;
		System.out.println("This is the first element: " + values[0]);
		System.out.println("This is the second element: " + values[1]);
		
		System.out.println(Arrays.toString(values));
		
		// Arrays are STATIC in SIZE 
		
		
		
		// how do we create a String array with 5 spaces?		
		String[] words = new String[5];
		
		words[0] = "dog";
		words[1] = "cat";
		words[2] = "bird";
		words[3] = "pig";
		
		/**
		 *	
		 	 
		for (int i = 0; i<words.length; i++)
			System.out.println(words[i]);
			
		*/
		
		System.out.println(Arrays.toString(words));
		
		String[] anotherArray = {"Hello", "my", "name", "is"};
		
		System.out.println(Arrays.toString(anotherArray));
		
		
		// System.out.println(words[6]); //java.lang.ArrayIndexOutOfBoundsException
		
		String[] fullName  = new String[] {"Doe", "Jane"};
		System.out.println(fullName[0]);
		
		String lastName = fullName[1];
		System.out.println(lastName);
		
		lastName = lastName + "asdas"; 
		System.out.println(lastName);
		System.out.println(fullName[1]);
		
		
	}

}
