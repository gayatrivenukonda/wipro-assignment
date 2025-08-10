package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Question2b extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = (String) request.getAttribute("studentName");
        int marks = (Integer) request.getAttribute("studentMarks");

        String grade;
        if (marks >= 90) grade = "A+";
        else if (marks >= 75) grade = "A";
        else if (marks >= 60) grade = "B";
        else if (marks >= 45) grade = "C";
        else grade = "Fail";

        out.println("<h2>Student Grade Report</h2>");
        out.println("Name: " + name + "<br>");
        out.println("Marks: " + marks + "<br>");
        out.println("Grade: " + grade);
    }
}