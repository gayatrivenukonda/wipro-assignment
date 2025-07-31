package com.javaintro;

public class Question36 {

	
		    public static void main(String[] args) {
		        System.out.println("---- Scenario 1: Properly released ----");
		        Tank t1 = new Tank();
		        t1.fill();
		        t1.empty();
		        t1.releaseTank();
		        t1 = null; 

		        System.out.println("\n---- Scenario 2: Not released ----");
		        Tank t2 = new Tank();
		        t2.fill();
		        
		        t2 = null;

		        
		        System.gc();

		        
		        try {
		            Thread.sleep(2000);
		        } catch (InterruptedException e) {
		            System.out.println("Interrupted.");
		        }

		        System.out.println("Program ending.");
		    }
		

	}
/*
 ---- Scenario 1: Properly released ----
Tank filled.
Tank emptied.
Tank resources released properly.

---- Scenario 2: Not released ----
Tank filled.
Error: Tank was not properly released before garbage collection!
Tank was released correctly.
Program ending.
 */

