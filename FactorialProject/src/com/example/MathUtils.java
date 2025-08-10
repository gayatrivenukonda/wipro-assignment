package com.example;

public class MathUtils {
	
	
        @Test
	    public static int factorial(int n) {
	        if (n < 0) {
	            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
	        }
	        int result = 1;
	        for (int i = 2; i <= n; i++) {
	            result *= i;
	        }
	        return result;
	    }
	}

