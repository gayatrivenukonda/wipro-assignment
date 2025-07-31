package com.javaintro;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your salary: ");
		double salary = sc.nextDouble();
		System.out.print("Enter your years of service: ");
		int years = sc.nextInt();
		double bonus = 0;
		if (years > 6) {
			bonus = salary * 0.10;
		}
System.out.println("your net bonus amount is:" + bonus);
sc.close();
	}

}
