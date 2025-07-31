package com.javaintro;
import java.util.Scanner;
public class Question34 {

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter Employee ID (format: YY-F-123): ");
		        String empId = sc.nextLine();

		        System.out.print("Enter Employee Name: ");
		        String name = sc.nextLine();

		        Employee emp = new Employee(empId, name);
		        System.out.println("\n--- Employee Details ---");
		        emp.displayDetails();

		        sc.close();
		    }
		

	}

/*
 Enter Employee ID (format: YY-F-123): 81-F-112
Enter Employee Name:  Bhanu

--- Employee Details ---
Employee Name:  Bhanu
Employee ID: 81-F-112
Year of Birth: 1981
Designation: Faculty
Employee Number: 112

 */
