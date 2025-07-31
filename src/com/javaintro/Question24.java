package com.javaintro;
import java.util.Scanner;
public class Question24 {
		
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int[] speed = new int[5];
		        int sum = 0;

		        
		        System.out.println("Enter the speed of 5 racers:");
		        for (int i = 0; i < 5; i++) {
		            speed[i] = sc.nextInt();
		            sum += speed[i];
		        }

		        
		        double average = sum / 5.0;

		        
		        System.out.println("Racers who qualified (speed > average " + average + "):");
		        for (int i = 0; i < 5; i++) {
		            if (speed[i] > average) {
		                System.out.println(speed[i]);
		            }
		        }

		        sc.close();
		    }
		

	}
/*
 Enter the speed of 5 racers:
40
60
50
70
30
Racers who qualified (speed > average 50.0):
60
70
 */

