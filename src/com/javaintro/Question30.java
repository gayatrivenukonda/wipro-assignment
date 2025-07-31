package com.javaintro;
import java.util.Scanner;
public class Question30 {

		@FunctionalInterface
		interface Minimum {
		    float minimum3(float a, float b, float c);
		}

		
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        
		        System.out.print("Enter first number: ");
		        float x = sc.nextFloat();

		        System.out.print("Enter second number: ");
		        float y = sc.nextFloat();

		        System.out.print("Enter third number: ");
		        float z = sc.nextFloat();

		       
		        Minimum min = (a, b, c) -> Math.min(a, Math.min(b, c));

		        
		        float result = min.minimum3(x, y, z);
		        System.out.println("The smallest value is: " + result);

		        sc.close();
		    }
		

	}
/*
 Enter first number: 12.3
Enter second number: 4.6
Enter third number: 9.1
The smallest value is: 4.6 
 */


