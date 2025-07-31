package com.javaintro;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
public class Question37 {
		
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        String fileName = "batchmates.txt";

		        try {
		           
		            File file = new File(fileName);
		            if (file.createNewFile()) {
		                System.out.println("File created: " + file.getName());
		            } else {
		                System.out.println("File already exists. Overwriting names.");
		            }

		            FileWriter writer = new FileWriter(fileName);
		            System.out.print("How many batchmates do you want to enter? ");
		            int count = scanner.nextInt();
		            scanner.nextLine(); 
		            for (int i = 1; i <= count; i++) {
		                System.out.print("Enter name of batchmate " + i + ": ");
		                String name = scanner.nextLine();
		                writer.write(name + "\n");
		            }
		            writer.close();
		            System.out.println("\nBatchmates' names saved successfully.");

		            
		            System.out.println("\n--- Batchmates List ---");
		            BufferedReader reader = new BufferedReader(new FileReader(fileName));
		            String line;
		            while ((line = reader.readLine()) != null) {
		                System.out.println(line);
		            }
		            reader.close();

		        } catch (IOException e) {
		            System.out.println("An error occurred:");
		            e.printStackTrace();
		        }

		        scanner.close();
		    }
		

	}
/*
 File already exists. Overwriting names.
How many batchmates do you want to enter? 4
Enter name of batchmate 1: Bhanu
Enter name of batchmate 2: Gayathri
Enter name of batchmate 3: kavya
Enter name of batchmate 4: Bindu

Batchmates' names saved successfully.

--- Batchmates List ---
Bhanu
Gayathri
kavya
Bindu 
 */

