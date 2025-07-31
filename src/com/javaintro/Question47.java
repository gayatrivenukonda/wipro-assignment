package com.javaintro;

public class Question47 {

	public static void main(String[] args) {
		

		class InvalidSalaryException extends Exception {
		    public InvalidSalaryException(String message) {
		        super(message);
		    }
		}

		class Employee {
		    private String name;
		    private double salary;

		    public Employee(String name, double salary) {
		        this.name = name;
		        this.salary = salary;
		    }

		    public double getSalary() {
		        return salary;
		    }

		    public String getName() {
		        return name;
		    }
		}

		class EmployeeService {

		    public void validateSalary(double salary) throws InvalidSalaryException {
		        if (salary < 0) {
		            throw new InvalidSalaryException("Salary cannot be negative.");
		        }
		    }

		    public void processSalary(Employee emp) throws InvalidSalaryException {
		        validateSalary(emp.getSalary());
		        System.out.println("✅ Salary processed for: " + emp.getName());
		    }

		    public void startProcess(Employee emp) throws InvalidSalaryException {
		        processSalary(emp);
		    }
		}

		
		        
		        Employee emp = new Employee("Ravi", 10000.0);
		        EmployeeService service = new EmployeeService();

		        try {
		            service.startProcess(emp);
		        } catch (InvalidSalaryException e) {
		            System.out.println("❌ Exception caught: " + e.getMessage());
		        }
		    }
		}

	
/*
 ❌ Exception caught: Salary cannot be negative.
 ✅ Salary processed for: Ravi
 */

