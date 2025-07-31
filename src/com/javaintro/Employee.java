package com.javaintro;

public class Employee {
	
	    private String employeeId; 
	    private String name;

	    private int yearOfBirth;
	    private char designationCode;
	    private int empNumber;

	    public Employee(String employeeId, String name) {
	        this.employeeId = employeeId;
	        this.name = name;
	        parseEmployeeId(); 
	    }

	   
	    public Employee(int id, String name2, double salary) {
			
		}


		private void parseEmployeeId() {
	        String[] parts = employeeId.split("-");

	        if (parts.length == 3) {
	           
	            int year = Integer.parseInt(parts[0]);
	            if (year >= 0 && year <= 25) {
	                yearOfBirth = 2000 + year; 
	            } else {
	                yearOfBirth = 1900 + year;
	            }

	            
	            designationCode = parts[1].charAt(0);

	            
	            empNumber = Integer.parseInt(parts[2]);
	        } else {
	            System.out.println("Invalid Employee ID Format");
	        }
	    }

	    public void displayDetails() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Year of Birth: " + yearOfBirth);
	        System.out.println("Designation: " + (designationCode == 'F' ? "Faculty" : "Staff"));
	        System.out.println("Employee Number: " + empNumber);
	    }
	}

