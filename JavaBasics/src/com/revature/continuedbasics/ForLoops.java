package com.revature.continuedbasics;

public class ForLoops {

	public static void main(String[] args) {
		
		int[] values = new int[100];
		
//		values[50] = 50;
//		System.out.println(values[50]);
		
		/** for loop ----------------- 
		 * 
		 * The 3 steps to make a for loop:
		 * 1. Initialize the variable
		 * 2. Set the termination condition 
		 * 3. Increment & reset the variable
		 * 
		 *    -- execute code to be performed 
		 */
		
		//-------- populate the array------------ 
		
		for(int i=0; i<100; i++) {
			values[i] = i+1;
			//System.out.println(values[i]);
		}	

		
		// Challenge : Print only odd numbers
		
//		for(int i=0; i<100; i+=2) {
//			
//			System.out.println(values[i]);			
//		}	 
		
		// Challenge : Print only even numbers
		for(int i=0; i<100; i++) {
//			if (values[i]%2 == 0)
			if (i%2!=0)
				System.out.println(values[i]);			
		}	 
	}

}
