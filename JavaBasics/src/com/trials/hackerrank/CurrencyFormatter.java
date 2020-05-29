package com.trials.hackerrank;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
 

public class CurrencyFormatter {

	public static void main(String[] args) {
		
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
	       
	      System.out.println(currencyFormatter.format(currencyAmount));
	      
	      
          currentLocale = Locale.CHINA;
	      currentCurrency = Currency.getInstance(currentLocale);
	      currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
	      System.out.println(currencyFormatter.format(currencyAmount));
	      
	      
          currentLocale = Locale.UK;
	      currentCurrency = Currency.getInstance(currentLocale);
	      currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
	      System.out.println(currencyFormatter.format(currencyAmount));
	      
	      
	      
	      
	      currentLocale = Locale.FRANCE;
	      currentCurrency = Currency.getInstance(currentLocale);
	      currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
	      System.out.println(currencyFormatter.format(currencyAmount));
	      
	      
	      
	      

		
	}

}
