package com.revature.practice;

import java.util.Scanner;
// you can also import with ctrl + shift + o


public class Driver {
	
	public static void main(String[] args) {  // shortcut for main method  : type main, press Ctrl + space enter 

		// Scanner is a special class to capture user input 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		// the nextLine() method captures a String value that we want to store in a variable
		String name = scan.nextLine();
		
		// the nextInt() method captures a integer value... nextDouble() to capture doubles
		System.out.println("How old are you? ");
		int age = scan.nextInt();
		
		/**
		 * Note: If you use the nextLine() method immediately following the nextInt() method, 
		 * recall that nextInt() reads integer tokens; because of this, 
		 * the last newline character for that line of integer input is still queued in the input buffer 
		 * and the next nextLine() will be reading the remainder of the integer line (which is empty).
		 */
		
		System.out.println("What's your favorite color? ");
		String color = scan.nextLine();
		color = scan.nextLine();
		
		
		
		// it is best practice to close our scanner 
		scan.close();
				
		System.out.printf("Hi " + name + "! You are %d years old and your favorite color is %s.", age, color);
		
		char m = 'f'; //single quotes denotes a Character, double quotes denotes a String
		
	}

}
