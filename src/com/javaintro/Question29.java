package com.javaintro;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Question29 {
		
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        try {
		            
		            System.out.print("Enter Register Number: ");
		            String regNo = sc.nextLine();

		            System.out.print("Enter Mobile Number: ");
		            String mobileNo = sc.nextLine();

		           
		            if (regNo.length() != 9 || mobileNo.length() != 10) {
		                throw new IllegalArgumentException("Invalid length");
		            }

		           
		            if (!regNo.matches("[a-zA-Z0-9]+")) {
		                throw new NoSuchElementException("Register number has invalid characters");
		            }

		            
		            if (!mobileNo.matches("[0-9]+")) {
		                throw new NumberFormatException("Mobile number has non-digit characters");
		            }

		            System.out.println("valid");

		        } catch (NoSuchElementException e) {
		            System.out.println("invalid");
		        } catch (NumberFormatException e) {
		            System.out.println("invalid");
		        } catch (IllegalArgumentException e) {
		            System.out.println("invalid");
		        }

		        sc.close();
		    }
		

	}

/*
 Enter Register Number: A12345B78
Enter Mobile Number: 9878437691
valid
Enter Register Number: A123
Enter Mobile Number: 98a7398292
invalid
 */
