package com.javaintro;

public class Question42 {

		    public static void someMethod2() throws Exception {
		        System.out.println("Inside someMethod2: About to throw Exception");
		        throw new Exception("Exception thrown from someMethod2");
		    }

		    
		    public static void someMethod() throws Exception {
		        try {
		            someMethod2();
		        } catch (Exception e) {
		            System.out.println("someMethod caught exception: " + e.getMessage());
		            System.out.println("someMethod is rethrowing the exception...");
		            throw e; 
		        }
		    }

		    public static void main(String[] args) {
		        try {
		            someMethod();
		        } catch (Exception e) {
		            System.out.println("main caught the rethrown exception.");
		            e.printStackTrace();  
		        }
		    }

	}
/*
 Inside someMethod2: About to throw Exception
someMethod caught exception: Exception thrown from someMethod2
someMethod is rethrowing the exception...
main caught the rethrown exception.
java.lang.Exception: Exception thrown from someMethod2
	at com.javaintro.Question42.someMethod2(Question42.java:7)
	at com.javaintro.Question42.someMethod(Question42.java:13)
	at com.javaintro.Question42.main(Question42.java:23)

 */

