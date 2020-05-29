package com.revature.continuedbasics;
 
public class MethodsContinued {

	public static void main(String[] args) {

		// System.out.println(); // we are invoking this method
		
		myPrintMethod("Hi There!");
		
	    String x = myStringyMethod("Jane Doe");
	
		System.out.println(x);
		
		int num = addNumbers(10,20);
		System.out.println(num);
	}	
	
	
	// void methods return nothing ... they just do something
	
	// if you want to call a method without instantiating the class 
	//     use the static keyword  
	static void myPrintMethod(String word) {
		System.out.println(word);
		
	}
	
	// this must RETURN a value of type String 
	static String myStringyMethod(String word) {
		return word + " How are you?";
	}
	
	static int addNumbers(int x, int y) {
		return(x+y);
	}
	
}

/**
	public class MethodsContinued {
	public static void main(String[] args) {
		//myPrintMethod("Hello there this is a random String!");
		String x = MyMethods.myStringyMethod("supercalifragilisticexpialidious");
		int n = MyMethods.addNumbers(50, 100);
		System.out.println(x);
		int num = MyMethods.addNumbers(10, 20);
		System.out.println(num);
	}
}

*/
