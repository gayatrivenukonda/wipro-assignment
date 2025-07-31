package com.javaintro;

public class Question27 {
		    
		    enum Currency {
		        TEN, TWENTY, FIFTY, HUNDRED, FIVE_HUNDRED, TWO_THOUSAND
		    }

		    public static void main(String[] args) {

		        
		        System.out.println("Available Currencies:");
		        for (Currency c : Currency.values()) {
		            System.out.println(c);
		        }

		        System.out.println("\nCurrency Descriptions:");

		       
		        for (Currency c : Currency.values()) {
		            switch (c) {
		                case TEN:
		                    System.out.println("TEN: ₹10 note, brown color, commonly used for small purchases.");
		                    break;
		                case TWENTY:
		                    System.out.println("TWENTY: ₹20 note, yellow-green, widely used in transport.");
		                    break;
		                case FIFTY:
		                    System.out.println("FIFTY: ₹50 note, fluorescent blue, good for mid-range buys.");
		                    break;
		                case HUNDRED:
		                    System.out.println("HUNDRED: ₹100 note, lavender color, popular and versatile.");
		                    break;
		                case FIVE_HUNDRED:
		                    System.out.println("FIVE_HUNDRED: ₹500 note, stone grey, high-value currency.");
		                    break;
		                case TWO_THOUSAND:
		                    System.out.println("TWO_THOUSAND: ₹2000 note, magenta, high-denomination (now phased out).");
		                    break;
		            }
		        }
		    }
		

	}

/*
 Available Currencies:
TEN
TWENTY
FIFTY
HUNDRED
FIVE_HUNDRED
TWO_THOUSAND

Currency Descriptions:
TEN: ₹10 note, brown color, commonly used for small purchases.
TWENTY: ₹20 note, yellow-green, widely used in transport.
FIFTY: ₹50 note, fluorescent blue, good for mid-range buys.
HUNDRED: ₹100 note, lavender color, popular and versatile.
FIVE_HUNDRED: ₹500 note, stone grey, high-value currency.
TWO_THOUSAND: ₹2000 note, magenta, high-denomination (now phased out).
 */
