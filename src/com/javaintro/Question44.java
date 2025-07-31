package com.javaintro;
import java.util.*;
public class Question44 {

		 static class Employee {
		    int id;
		    String name;
		    double salary;

		   
		    public Employee(int id, String name, double salary) {
		        this.id = id;
		        this.name = name;
		        this.salary = salary;
		    }

		   
		    public String toString() {
		        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
		    }
		}

		
		    public static void main(String[] args) {
		        List<Employee> employees = new ArrayList<>();

		        
		        employees.add(new Employee(101, "Bhanu", 35000));
		        employees.add(new Employee(102, "Gayathri", 50000));
		        employees.add(new Employee(103, "jaji", 45000));
		        employees.add(new Employee(104, "duhita", 50000));

		        System.out.println("Original List:");
		        employees.forEach(System.out::println);

		       
		        employees.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));
		        System.out.println("\nSorted by Salary (Descending):");
		        employees.forEach(System.out::println);

		        // Sort by name (alphabetically)
		        employees.sort((e1, e2) -> e1.name.compareToIgnoreCase(e2.name));
		        System.out.println("\nSorted by Name (Alphabetically):");
		        employees.forEach(System.out::println);
		    }
		}

	/*
	 Original List:
ID: 101, Name: Bhanu, Salary: 35000.0
ID: 102, Name: Gayathri, Salary: 50000.0
ID: 103, Name: jaji, Salary: 45000.0
ID: 104, Name: duhita, Salary: 50000.0

Sorted by Salary (Descending):
ID: 102, Name: Gayathri, Salary: 50000.0
ID: 104, Name: duhita, Salary: 50000.0
ID: 103, Name: jaji, Salary: 45000.0
ID: 101, Name: Bhanu, Salary: 35000.0

Sorted by Name (Alphabetically):
ID: 101, Name: Bhanu, Salary: 35000.0
ID: 104, Name: duhita, Salary: 50000.0
ID: 102, Name: Gayathri, Salary: 50000.0
ID: 103, Name: jaji, Salary: 45000.0
	 */


