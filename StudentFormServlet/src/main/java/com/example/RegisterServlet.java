package com.example;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/REgisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        // Read form data
        String name = request.getParameter("studentName");
        String email = request.getParameter("studentEmail");
        String course = request.getParameter("studentCourse");

        // Set response type
        response.setContentType("text/html");

        // Display output
        PrintWriter out = response.getWriter();
        out.println("<h2>Student Details</h2>");
        out.println("Name: " + name + "<br>");
        out.println("Email: " + email + "<br>");
        out.println("Course: " + course + "<br>");
    }
}

	