package com.jatin.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MovieDashboardServlet")
public class MovieDashboardServlet extends HttpServlet {

    @Override
    protected void doGet(jakarta.servlet.http.HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        response.getWriter().println("<h1>Welcome to Movie Dashboard</h1>");
        response.getWriter().println("<p>Login Successful!</p>");
    }
}