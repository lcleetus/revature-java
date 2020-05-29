package com.revature.basics;

public class ControlFlow {

	public static void main(String[] args) {

		
		//    If/Else Statements
		
		boolean hungry = true;   // we will toggle this 
		
		boolean niceSmells = true;		
		int hungerLevel = 3;
		
		if(hungerLevel > 5 || niceSmells) {
			System.out.println("I' m Starving!!!.... ");
		} else{
			System.out.println("I',m Good!!!");
		}
		
		
		if(hungerLevel > 5 && niceSmells) {
			System.out.println("I' m Starving!!!.... ");
		} else{
			System.out.println("I',m Good!!!");
		}
		

		
		int favTemp = 72;
		int currTemp = 82;
		String statement;
		
		if(currTemp < favTemp) {
			statement = "It's too cold";
		} else if (currTemp > favTemp)
			statement = "It's too Hot! ";
		else if (currTemp == favTemp) {
			statement = "It's  just perfect! ";
		} else {
			statement = "I'm not sure! ";
		}
		
		System.out.println(statement);
		
		
		// -------------------------SWITCH statements------------------------------------------------------------
		
		String monthName;
		
		switch(month) {
			case 1: monthName = "January";
				
			//It starts with the case it matches. Then it executes each case following it until it encounters a break

			
			case 2: monthName = "Feb";
				break;
			case 3: monthName = "March";
				break;
			case 4: monthName = "April";
				break;
			default: monthName = "Not set";
				break;
		
			}
		
		System.out.println("The month is " + monthName);
		
		}
		
	static int month = 1; // global variable. Not a good program design as it creates spaghetii code 
		
	}
		
		



