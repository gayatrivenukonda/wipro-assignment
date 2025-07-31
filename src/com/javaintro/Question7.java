package com.javaintro;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		

	
		        Scanner sc = new Scanner(System.in);

		        
		        System.out.print("Enter total number of classes held: ");
		        int totalClasses = sc.nextInt();

		        System.out.print("Enter number of classes attended: ");
		        int attendedClasses = sc.nextInt();

		        
		        double percentage = ((double) attendedClasses / totalClasses) * 100;
		        System.out.printf("Percentage of classes attended: %.2f%%\n", percentage);

		        
		        if (percentage >= 70) {
		            System.out.println("X Student is allowed to sit in exam.");
		        } else {
		            System.out.println("Y Student is not allowed to sit in exam.");
		        }
		        sc.close();
	}
}


