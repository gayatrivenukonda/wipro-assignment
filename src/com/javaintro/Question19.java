package com.javaintro;
import java.util.Scanner;
public class Question19 {

	    
	    static abstract class Bank {
	        String accNo;
	        String custName;
	        int custGender; 
	        String custJob;
	        double curBal;

	        Bank(String accNo, String custName, int custGender, String custJob, double curBal) {
	            this.accNo = accNo;
	            this.custName = custName;
	            this.custGender = custGender;
	            this.custJob = custJob;
	            this.curBal = curBal;
	        }

	        public String toString() {
	            return "Account No: " + accNo +
	                   "\nCustomer Name: " + custName +
	                   "\nGender: " + (custGender == 1 ? "Male" : "Female") +
	                   "\nJob: " + custJob +
	                   "\nCurrent Balance: RM" + curBal;
	        }

	        public abstract double calcBalance();
	    }

	    
	    static class Saving extends Bank {
	        double savRate;

	        Saving(String accNo, String custName, int custGender, String custJob, double curBal, double savRate) {
	            super(accNo, custName, custGender, custJob, curBal);
	            this.savRate = savRate;
	        }

	        public double calcBalance() {
	            return curBal + (savRate * curBal);
	        }
	    }

	    
	    static class Current extends Bank {
	        boolean fixedDep;
	        double curRate;

	        Current(String accNo, String custName, int custGender, String custJob, double curBal, boolean fixedDep, double curRate) {
	            super(accNo, custName, custGender, custJob, curBal);
	            this.fixedDep = fixedDep;
	            this.curRate = curRate;
	        }

	        public double calcBalance() {
	            double bal = curBal + (curRate * curBal);
	            if (fixedDep) {
	                bal -= 150; 
	            }
	            return bal;
	        }
	    }

	    
	    public static void main(String[] args) {
	        Bank[] customers = {
	            new Saving("S001", "Alice", 2, "Teacher", 5000, 0.03),
	            new Current("C001", "Bob", 1, "Engineer", 8000, true, 0.02),
	            new Current("C002", "Charlie", 1, "Doctor", 10000, false, 0.015),
	            new Saving("S002", "Diana", 2, "Nurse", 3000, 0.025)
	        };

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter account number to search: ");
	        String searchAcc = sc.nextLine();

	        boolean found = false;
	        int currentCount = 0;
	        double currentTotalBalance = 0;

	        for (Bank b : customers) {
	            
	            if (b.accNo.equalsIgnoreCase(searchAcc)) {
	                System.out.println("\nCustomer Details:");
	                System.out.println(b);
	                System.out.println("Balance After Interest/Charges: RM" + b.calcBalance());
	                found = true;
	            }

	           
	            if (b instanceof Current) {
	                currentCount++;
	                currentTotalBalance += b.calcBalance();
	            }
	        }

	        if (!found) {
	            System.out.println("Account number not found.");
	        }

	        System.out.println("\nTotal Current Account Holders: " + currentCount);
	        System.out.println("Total Balance in Current Accounts: RM" + currentTotalBalance);
	    }
	}
