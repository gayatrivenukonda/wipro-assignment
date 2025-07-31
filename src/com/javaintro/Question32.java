package com.javaintro;

public class Question32 {

	
		    public static void main(String[] args) {
		               try {
		            
		            int[] arr = new int[-5];
		        } catch (NegativeArraySizeException e) {
		            System.out.println("Caught NegativeArraySizeException:");
		            e.printStackTrace();
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Caught ArrayIndexOutOfBoundsException:");
		            e.printStackTrace();
		        } catch (StringIndexOutOfBoundsException e) {
		            System.out.println("Caught StringIndexOutOfBoundsException:");
		            e.printStackTrace();
		        } catch (IndexOutOfBoundsException e) {
		            System.out.println("Caught IndexOutOfBoundsException:");
		            e.printStackTrace();
		        } catch (NullPointerException e) {
		            System.out.println("Caught NullPointerException:");
		            e.printStackTrace();
		        } catch (ArithmeticException e) {
		            System.out.println("Caught ArithmeticException:");
		            e.printStackTrace();
		        } catch (Exception e) {
		            System.out.println("Caught General Exception:");
		            e.printStackTrace();
		        }

		        System.out.println("Program continues after exception handling.");
		    }
		

	}

/*
Caught NegativeArraySizeException:
java.lang.NegativeArraySizeException: -5
	at com.javaintro.Question32.main(Question32.java:9)
Program continues after exception handling.
   
*/
