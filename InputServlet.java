package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class InputServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("username");
        int marks = Integer.parseInt(request.getParameter("marks"));
        request.setAttribute("username", name);
        request.setAttribute("marks", marks);
        RequestDispatcher rd = request.getRequestDispatcher("GradeServlet");
        rd.forward(request, response);
    }
}