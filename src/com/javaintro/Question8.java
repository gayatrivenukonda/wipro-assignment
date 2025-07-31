package com.javaintro;
import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		      
		        System.out.print("Enter total number of classes held: ");
		        int totalClasses = sc.nextInt();

		        System.out.print("Enter number of classes attended: ");
		        int attendedClasses = sc.nextInt();

		        
		        double attendance = ((double) attendedClasses / totalClasses) * 100;
		        System.out.printf("Attendance percentage: %.2f%%\n", attendance);

		        
		        sc.nextLine(); 
		        System.out.print("Do you have a medical cause? (Y/N): ");
		        String cause = sc.nextLine();

		        
		        if (attendance >= 75 || cause.equalsIgnoreCase("Y")) {
		            System.out.println("Y You are allowed to sit in the exam.");
		        } else {
		            System.out.println("N You are not allowed to sit in the exam.");
		        }

		        sc.close();
		    
		}

				}
		

	


