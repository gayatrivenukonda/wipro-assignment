package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class GradeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = (String) request.getAttribute("username");
        int marks = (int) request.getAttribute("marks");
        String grade = (marks >= 90) ? "A" : (marks >= 75) ? "B" : (marks >= 50) ? "C" : "F";
        out.println("<html><body>");
        out.println("<h2>Hello, " + name + "</h2>");
        out.println("<h3>Your Grade: " + grade + "</h3>");
        out.println("</body></html>");
    }
}