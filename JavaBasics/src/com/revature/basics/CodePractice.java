package com.revature.basics;


	
	
	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class CodePractice {



	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	    	
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	    	int i = 0;
	    	while (sc.hasNext()) {
	    	    System.out.printf("%d %s", ++i, sc.nextLine());
	    	    System.out.println();
	    	}
	    	System.out.println("--------OUTPUT--END---------");
	    	
	    	sc.close();
	    	
	    	/**     The 4 Primitive data types that hold integer values
	    	 * 
	    	 * 
	    	
			    	Scanner sc = new Scanner(System.in);
			        int t=sc.nextInt();
		
			        for(int i=0;i<t;i++)
			        {
		
			            try
			            {
			                long x = sc.nextLong();
			                System.out.println(x+" can be fitted in:");
			                if(x>=-128 && x<=127)System.out.println("* byte");
			                if(x>=-32767 && x<=32768)System.out.println("* short");
			                if(x>=-2147483647L && x<=2147483648L)System.out.println("* int");
			                if(x>=-9223372036854775807L && x<=9223372036854775807L)System.out.println("* long");
			                
			                //Complete the code
			            }
			            catch(Exception e)
			            {
			                System.out.println(sc.next()+" can't be fitted anywhere.");
			            }
		
			        }
			    
	    	
	    	*/
	    	
	    	
	    	/**
	    	 * Multiplication table 
	    	
		        int N = scanner.nextInt();
		        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	
		        scanner.close();
		        
		        if (N >= 2 && N<=20)
		        {
		            for (int i=1; i<11; i++)
		            {
		                System.out.printf("%d x %d = %d%n", N, i, N*i);
		            }
		        }
	        
	        
	        */
	    	
	    	
	    	
	    	/**
	    	 *    ---- Print numbers in a Series------------
	    	 * 
	    	 
			    	Scanner in = new Scanner(System.in);
			        int t=in.nextInt();
			        for(int i=0;i<t;i++){
			            int a = in.nextInt();
			            int b = in.nextInt();
			            int n = in.nextInt();
			            
			            int[] arrNum = new int[n];
			            int  num = a;
			            int k = 0;
			            
			            for(int j=0; j<n; j++)
			            {
			            	
			            	num +=  (int) Math.pow(2, k)*b;
			            	arrNum[j] = num;
			            	
			            	k++;
			            	 
			            	System.out.printf("%d ", num);
			            	
			            }
			            
			            //System.out.printf("%d %d %d" , a, b, n);
			            //System.out.printf("This is line %d", i);
			            
			            
			            
			            
			        }
			        in.close();
			        
	        */
	    	
	    }
	}



