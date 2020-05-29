package com.revature.loops;

public class WhileLoops {

	public static void main(String[] args) {
		
		// While loops:
		// While *something* is true, do something.
		
		// a while(true) loop will loop for infinity
		
		/**
		 * 		
					while(true) {
						// this is the code to execute
						System.out.println("Looping!");
					}
					
		*/
		
		
		int count = 0;
		while (count<10) {
			System.out.printf("looping %d ", count+1);
			System.out.println();
			count++;
			
			if(count ==7) {
				break; // break will force us to exit this loop
			}
		}
		
		boolean flag = false;
		
		do {
			
			System.out.println("Print");
			
		}while(flag);
		
		// DO WHILE Loop 
		// checks condition after executing the code block first
		
		int value = 11;
		do {
			System.out.println("Value is less than 10 = The do-while loop is looping " + value);
		} while (value < 10); 
		
		
		
		/**
		 *            FOR Loops
		 
				
				for (int i = 0; i < 10; i++) {
					System.out.println("in my FOR loop " + i);
				}
				
				String cat = "cat";
				for (int i = 0; i < cat.length(); i++) {
					System.out.println(cat.charAt(i));
					// System.out.println(cat.indexOf('c'));    // these are String API methods 
				}
		
		*/

	}

}
