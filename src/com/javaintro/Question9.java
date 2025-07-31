package com.javaintro;
import java.util.Scanner;
public class Question9 {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);
		        double totalValue = 0.0;
		        char more;

		        do {
		            System.out.print("Enter product number (1, 2, or 3): ");
		            int productNumber = scanner.nextInt();

		            System.out.print("Enter quantity sold: ");
		            int quantity = scanner.nextInt();

		            double price = 0.0;

		            switch (productNumber) {
		                case 1:
		                    price = 22.50;
		                    break;
		                case 2:
		                    price = 44.50;
		                    break;
		                case 3:
		                    price = 9.98;
		                    break;
		                default:
		                    System.out.printf("Invalid product number%n");
		                    break; // skip rest and loop again
		            }

		            totalValue += price * quantity;
		            System.out.print("Do you want to enter another sale? (Y/N): ");
		            more = scanner.next().charAt(0);

		        } while (Character.toUpperCase(more) == 'Y');

		        System.out.printf("Total retail value of products sold: ₹%.2f\n", totalValue);
		        scanner.close();
		    }


	}
	
