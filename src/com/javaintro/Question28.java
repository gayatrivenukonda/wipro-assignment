package com.javaintro;

public class Question28 {
		interface PerformOperation {
		    boolean check(int a);
		}

		

		    
		    public static PerformOperation isOdd() {
		        return (int a) -> a % 2 != 0;
		    }

		   
		    public static PerformOperation isPrime() {
		        return (int a) -> {
		            if (a <= 1) return false;
		            for (int i = 2; i <= Math.sqrt(a); i++) {
		                if (a % i == 0) return false;
		            }
		            return true;
		        };
		    }

		   
		    public static PerformOperation isPalindrome() {
		        return (int a) -> {
		            int original = a, reversed = 0;
		            while (a != 0) {
		                int digit = a % 10;
		                reversed = reversed * 10 + digit;
		                a /= 10;
		            }
		            return original == reversed;
		        };
		    }

		    public static void main(String[] args) {
		        PerformOperation op1 = isOdd();
		        PerformOperation op2 = isPrime();
		        PerformOperation op3 = isPalindrome();

		       
		        int num1 = 7;
		        int num2 = 11;
		        int num3 = 121;
		        int num4 = 10;

		        System.out.println(num1 + " is odd? " + op1.check(num1));          // true
		        System.out.println(num2 + " is prime? " + op2.check(num2));        // true
		        System.out.println(num3 + " is palindrome? " + op3.check(num3));   // true
		        System.out.println(num4 + " is odd? " + op1.check(num4));          // false
		    }
		

	}

/*
 7 is odd? true
11 is prime? true
121 is palindrome? true
10 is odd? false
 */
