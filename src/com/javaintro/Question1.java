package com.javaintro;
public class Question1{

	public static void main(String[] args) {
		int number = 2345;
		number = number + 8;
		int quotient = number / 3;
		int modResult = quotient % 5;
		int finalResult = modResult * 5;
		
		
		System.out.println("Final result is: " + finalResult);
	}

}
