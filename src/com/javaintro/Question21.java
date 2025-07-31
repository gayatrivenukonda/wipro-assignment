package com.javaintro;
abstract class Person {
 abstract void eat();
 abstract void exercise();
}


class Athlete extends Person {
 void eat() {
     System.out.println("Athlete eats a healthy diet with high protein.");
 }

 void exercise() {
     System.out.println("Athlete exercises daily with intense workouts.");
 }
}
class LazyPerson extends Person {
 void eat() {
     System.out.println("LazyPerson eats junk food while watching TV.");
 }

 void exercise() {
     System.out.println("LazyPerson rarely exercises and prefers to sleep.");
 }
}

public class Question21 {
 public static void main(String[] args) {
     Person athlete = new Athlete();
     Person lazy = new LazyPerson();

     System.out.println("=== Athlete ===");
     athlete.eat();
     athlete.exercise();

     System.out.println("\n=== Lazy Person ===");
     lazy.eat();
     lazy.exercise();
 }
}
    

			
	     	
		
		
		 

	


