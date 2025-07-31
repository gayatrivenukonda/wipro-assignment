package com.javaintro;

		class EmployeeV2 {
		    private String name;
		    private double salary;

		    public Employee(String name, double salary) {
		        this.name = name;
		        this.salary = salary;
		    }

		    public String getName() {
		        return name;
		    }

		    public double getSalary() {
		        return salary;
		    }
		}

		
		@FunctionalInterface
		interface EmployeeProcessor {
		    void process(Employee e);
		}

		public class Question48 {
		    public static void main(String[] args) {

		        
		        Employee emp = new Employee("Gayathri", 50000.0);

		        
		        EmployeeProcessor printDetails = (e) -> {
		            System.out.println("Employee Name: " + e.getName());
		            System.out.println("Salary: ₹" + e.getSalary());
		        };

		        
		        EmployeeProcessor calculateBonus = (e) -> {
		            double bonus = e.getSalary() * 0.10;
		            System.out.println("Bonus (10%): ₹" + bonus);
		        };

		       
		        System.out.println("=== Employee Details ===");
		        printDetails.process(emp);

		        System.out.println("\n=== Bonus Calculation ===");
		        calculateBonus.process(emp);
		    }
		}
