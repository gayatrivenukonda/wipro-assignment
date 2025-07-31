package com.javaintro;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Question31 {
		
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        
		        try {
		            System.out.print("Enter an integer: ");
		            int num = scanner.nextInt(); 
		            System.out.println("You entered: " + num);
		        } catch (InputMismatchException e) {
		            System.out.println("Caught InputMismatchException: You must enter an integer!");
		        }

		        scanner.nextLine(); 

		        
		        try {
		            System.out.print("Enter a string: ");
		            String str = scanner.nextLine();
		            System.out.print("Enter an index to access: ");
		            int index = scanner.nextInt(); 

		            char ch = str.charAt(index); 
		            System.out.println("Character at index " + index + ": " + ch);
		        } catch (StringIndexOutOfBoundsException e) {
		            System.out.println("Caught StringIndexOutOfBoundsException: Invalid index for the string!");
		        }

		        scanner.close();
		    }
		

	}
/*
 Enter an integer: abc
Caught InputMismatchException: You must enter an integer!
Enter a string: hello
Enter an index to access: 2
Character at index 2: l
 */

