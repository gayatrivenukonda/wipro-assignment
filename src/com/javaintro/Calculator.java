package com.javaintro;

public class Calculator {
			

				        public int add(int a, int b) {
				            return a + b;
				        }

				        public int diff(int a, int b) {
				            return a - b;
				        }

				        public int mul(int a, int b) {
				            return a * b;
				        }

				        public double div(int a, int b) {
				            if (b != 0)
				                return (double) a / b;
				            else {
				                System.out.println("Cannot divide by zero");
				                return 0;
				            }
				        }

public static void main(String[] args) {

				        Calculator calc = new Calculator();

				        int a = 20, b = 10;

				        System.out.println("Addition: " + calc.add(a, b));
				        System.out.println("Difference: " + calc.diff(a, b));
				        System.out.println("Multiplication: " + calc.mul(a, b));
				        System.out.println("Division: " + calc.div(a, b));
}
}
