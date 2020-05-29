package com.trials.hackerrank;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.*;
import java.text.*;

public class CurrencyFormatter {

	public static void main(String[] args) {
		
		
		 /* Save input */
	    Scanner scanner = new Scanner(System.in);
	    double payment = scanner.nextDouble();
	    scanner.close();
	    
		  /* Create custom Locale for India - I used the "IANA Language Subtag Registry" to find India's country code */
	    Locale indiaLocale = new Locale("en", "IN");

	    /* Create NumberFormats using Locales */
	    NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
	    NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
	    NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
	    NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

	    /* Print output */        
	    System.out.println("US: "     + us.format(payment));
	    System.out.println("India: "  + india.format(payment));
	    System.out.println("China: "  + china.format(payment));
	    System.out.println("France: " + france.format(payment));
		
		
		
		/**
		 * 
		
		
		
		//This is the amount which we want to format
	      Double currencyAmount = new Double(123456789.555);
	       
	      //Get current locale information
	      Locale currentLocale = Locale.getDefault();
	       
	      //Get currency instance from locale; This will have all currency related information
	      Currency currentCurrency = Currency.getInstance(currentLocale);
	       
	      //Currency Formatter specific to locale
	      NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
	 
	      //Test the output
	     // System.out.println(currentLocale.getDisplayName());     
	      
	      //System.out.println(currentCurrency.getDisplayName());
	       
	      System.out.println("US: " + currencyFormatter.format(currencyAmount));
	      
	      
          currentLocale = Locale.CHINA;
	      currentCurrency = Currency.getInstance(currentLocale);
	      currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
	      System.out.println("India: " +currencyFormatter.format(currencyAmount));
	      
	      Locale indLocale = new Locale("hi", "IN");
          currentLocale = indLocale;
	      currentCurrency = Currency.getInstance(currentLocale);
	      currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
	      System.out.println("China: " +currencyFormatter.format(currencyAmount));
	      
	      
	      
	      
	      currentLocale = Locale.FRANCE;
	      currentCurrency = Currency.getInstance(currentLocale);
	      currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
	      System.out.println("France: " +currencyFormatter.format(currencyAmount));
	      
	      
	      */
	      

		
	}

}
