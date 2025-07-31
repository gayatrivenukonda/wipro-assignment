package com.javaintro;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question43 {
	
	
	    public static void main(String[] args) {
	        // Change the path if your file is elsewhere
	        String filePath = "C:\\Users\\mural\\gayijava\\workspaces\\javaintro\\javaintro\\src\\example.txt";

	        // try-with-resources: automatically closes the reader
	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;

	            System.out.println("Reading file: " + filePath);
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }

	        } catch (IOException e) {
	            System.out.println("An error occurred while reading the file:");
	            System.out.println(e.getMessage());
	        }
	    }
	}
/*
 Reading file: C:\Users\mural\gayijava\workspaces\javaintro\javaintro\src\example.txt
Hello, this is a test file.
This line will be read using BufferedReader.
 */


		
		
		  
	


