package com.revature.basics;

public class Variables {


	public static void main(String[] args) {
	
		// a Variable is where you store data 
		// x = 10;
		//Java is strongly typed 
		
		//Primitive datatypes are like buckets of reserved memory 
		
		
		int x=10;
		String word = "Lenita";
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		System.out.println("Maximum value is : " + max);
		System.out.println("Minimum vaue is : " + min);
		
		byte reallySmallnumber = 127;  //8 bits of reserved memory
		short shortNumber = 32767;  // 16 bits of memory
		int var = 2147483647; // 32 bits of memory
		long bigNumber = 9223372036854775807L;  // 64 bits of memory
		
		float anotherNumber = 713;   // 32 bits of memory
		double  balance = 23.53;
		
		char letter = 'f';   // 16 bits of memory
		boolean isDecision = true;  // 1 bit of memory
		
		
		String myWord = "This is my word! ";		
		System.out.println(myWord);
		
		
		String one = "1";
		System.out.println(one);
		
		
		int n = 1;
		System.out.println(n);
		
		System.out.println(one+n); // concatenates
		System.out.println(n+200);
		
		
		
		// Challenges: Find a method to convert our value one (of type string) to an int
		// then print the value of n + one 	
		
		System.out.println(n+ Integer.parseInt(one));
		
		
		int oneInt = Integer.parseInt(one);
		System.out.println(n+ oneInt);
		
		
	}
	

}
