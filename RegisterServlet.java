package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Registered Info</h2>");
        out.println("Name: " + name + "<br>");
        out.println("Email: " + email);
        out.println("</body></html>");
    }
}