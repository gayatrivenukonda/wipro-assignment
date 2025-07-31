package com.javaintro;
import java.util.*;
import java.util.stream.Collectors;
public class Question45 {
		
		    static class Student {
		        int id;
		        String name;
		        String department;

		        public Student(int id, String name, String department) {
		            this.id = id;
		            this.name = name;
		            this.department = department;
		        }

		        @Override
		        public String toString() {
		            return name; // Just return name for simple printing
		        }
		    }
		    public static void main(String[] args) {
		        List<Student> students = Arrays.asList(
		            new Student(1, "Bhanu", "CIVIL"),
		            new Student(2, "Gayathri", "ECE"),
		            new Student(3, "Bindu", "AIML"),
		            new Student(4, "Jajii", "CSE"),
		            new Student(5, "Duhita", "ECE")
		        );
		        
		        Map<String, List<Student>> groupedByDept = students.stream()
		                .collect(Collectors.groupingBy(s -> s.department));

		        for (Map.Entry<String, List<Student>> entry : groupedByDept.entrySet()) {
		            System.out.println("Department: " + entry.getKey());
		            for (Student s : entry.getValue()) {
		                System.out.println(" - " + s.name);
		            }
		        }
		    }
	}
/*
 Department: CIVIL
 - Bhanu
Department: CSE
 - Jajii
Department: ECE
 - Gayathri
 - Duhita
Department: AIML
 - Bindu
 */
