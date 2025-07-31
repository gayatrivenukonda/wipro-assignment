package com.javaintro;

import java.util.Scanner;

public class Question16 {
			
		    public static void main(String[] args) {
		    	
		    
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter size");
		        int size=sc.nextInt();
		        int marks[]=new int[size];
		        
		        int i=0;
		        while(i<3) {
		        	System.out.println("Enter marks for student :"+(i+1)+": ");
		        	int mark=sc.nextInt();
		        	if(mark>0 && mark<=100)
		        	{
		        		marks[i] =mark;
		        		
		        		i++;
		        	}
		        	else {
		        		System.out.println("Invalid nput try again");
		        		
		        	}
		        	
		        	}
		        double average=(marks[0]+marks[1]+marks[2])/3;
		        System.out.println("Average:"+average);
		    }
		        }
/*
 Enter size
4
Enter marks for student :1: 
75
Enter marks for student :2: 
80
Enter marks for student :3: 
90
Average:81.0
 */
		  


