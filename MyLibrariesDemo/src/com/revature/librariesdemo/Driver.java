package com.revature.librariesdemo;

// import java.util.*;  // indicates that I've imported all classes in the util package

// packages > classes > methods

import java.util.Arrays;
import java.util.Scanner;

import com.revature.anotherpackage.MyUtils;

public class Driver {
	
	public static void main(String[] args) {
	
		// initialize an array with 5 spaces
		int[] values = new int[5];
		
		for (int i=0; i<values.length; i++) {
			values[i] = i+1;
			System.out.println(values[i]);
		}
			
		int[] numbers = {42, 106, 87, 2, 0};
		
		System.out.println(numbers); // prints out [I@15db9742		
		//instead print out the Array as a String 
		System.out.println(Arrays.toString(numbers));
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		// now we will use the method we created in the MyUtils class in another package 
		// I want to use our addAThousand method...
		
		int n = MyUtils.addAThousand(12); // this works only because we've imported the class from the other package 
		
		System.out.println("My number plus 1000 is: " + n);
		
		// create a Scanner object to take in user input and then invoke the addAThousand method to it.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();		
		scan.close();
		
		int result = MyUtils.addAThousand(num); 
		System.out.println("My number plus 1000 is: " + result);
		
	}
}
