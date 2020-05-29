package com.revature.basics;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticSolution {
	
	static int B, H;
    static boolean flag=false;

    static {
        Scanner sc = new Scanner(System.in);
        B=sc.nextInt();
        H=sc.nextInt();
        
        if (B>0 && H>0)
            flag = true;
        else
        	System.out.println("java.lang.Exception: Breadth and height must be positive");
        
        if (B<-100 || B> 100 || H<-100 ||  H>100)
        	System.out.println("Input Out of range");
    }    

    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}

}
