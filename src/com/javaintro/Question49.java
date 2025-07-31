package com.javaintro;
import java.util.Optional;
public class Question49 {
		

		
		class MissingFieldException extends RuntimeException {
		    public MissingFieldException(String message) {
		        super(message);
		    }
		}

		// Employee class with optional fields
		class Employee {
		    private String name;
		    private double salary;
		    private Optional<String> email;
		    private Optional<String> department;

		    public Employee(String name, double salary, String email, String department) {
		        this.name = name;
		        this.salary = salary;
		        // Wrap optional fields using Optional.ofNullable
		        this.email = Optional.ofNullable(email);
		        this.department = Optional.ofNullable(department);
		    }

		    public String getName() {
		        return name;
		    }

		    public double getSalary() {
		        return salary;
		    }

		    public Optional<String> getEmail() {
		        return email;
		    }

		    public Optional<String> getDepartment() {
		        return department;
		    }
		}

		// Main class
		
		    public static void main(String[] args) {

		        // Employee with missing department
		        Employee emp1 = new Employee("Gayathri", 50000.0, "gayathri@example.com", null);

		        // Employee with missing email
		        Employee emp2 = new Employee("Ravi", 60000.0, null, "HR");

		        // Employee with both fields
		        Employee emp3 = new Employee("Lakshmi", 70000.0, "lakshmi@example.com", "IT");

		        // Example 1: Safely access values with default
		        System.out.println("== Employee 1 ==");
		        System.out.println("Name: " + emp1.getName());
		        System.out.println("Email: " + emp1.getEmail().orElse("No Email Provided"));
		        System.out.println("Department: " + emp1.getDepartment().orElse("General"));

		        // Example 2: Throw exception if required field missing
		        System.out.println("\n== Employee 2 ==");
		        String email2 = emp2.getEmail().orElseThrow(() ->
		            new MissingFieldException("Email is required for employee: " + emp2.getName())
		        );
		        System.out.println("Email: " + email2);
		        System.out.println("Department: " + emp2.getDepartment().orElse("General"));

		        // Example 3: Print full info if all present
		        System.out.println("\n== Employee 3 ==");
		        System.out.println("Email: " + emp3.getEmail().get());
		        System.out.println("Department: " + emp3.getDepartment().get());
		    }
		}
	


