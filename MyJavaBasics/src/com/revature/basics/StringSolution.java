package com.revature.basics;

import java.io.*;
import java.util.*;

public class StringSolution {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	     String A=sc.next();
	     String B=sc.next();
	     sc.close();
	     
	     
	     
	     /**
	      * 
	      *  System.out.println(A.length() + B.length());
        	 if (A.compareTo(B) > 0) {
            	System.out.println("Yes");
        		} else {
            		System.out.println("No");
        			}
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
        
        
	      * 
	      * 
	      */
	     
	     
	     
	     
	     System.out.println(A.length() + B.length());
	     
	  
	     if(A.compareToIgnoreCase(B) <0)
	    	 System.out.println("No");
	     else
	    	 System.out.println("Yes");
	     
	     String result = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase()
	     + " "  
	     + B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();
	     System.out.println(result);
		

	}

}
