package com.javaintro;
import java.util.Scanner;
public class MyTraiangle {
		    
		    public static double area(double a, double b, double c) {
		        double s = (a + b + c) / 2; 
		        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
		    }

		    
		    public static double perimeter(double a, double b, double c) {
		        return a + b + c;
		    }

		   
		    public static boolean isValid(double a, double b, double c) {
		        return (a + b > c) && (a + c > b) && (b + c > a);
		    }

		    
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        while (true) {
		            System.out.print("Enter side a (Enter 1 to exit): ");
		            double a = sc.nextDouble();

		            if (a == 1) {
		                System.out.println("Bye~");
		                break;
		            }

		            System.out.print("Enter side b: ");
		            double b = sc.nextDouble();

		            System.out.print("Enter side c: ");
		            double c = sc.nextDouble();

		            if (isValid(a, b, c)) {
		                System.out.println("Perimeter: " + perimeter(a, b, c));
		                System.out.println("Area: " + area(a, b, c));
		            } else {
		                System.out.println("The input is invalid.");
		            }
		        }

		        sc.close();
		    }
		
	}
/*
 Enter side a (Enter 1 to exit): 3
Enter side b: 4
Enter side c: 5
Perimeter: 12.0
Area: 6.0
Enter side a (Enter 1 to exit): 1
Bye~
 */


