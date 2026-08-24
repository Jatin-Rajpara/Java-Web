package com.jatin.servlets;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThemeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        ServletContext context = getServletContext();

        String app = context.getInitParameter("appTheme");

        response.getWriter().println(
            "<h2>Current App Theme: " + app + "</h2>"
        );
    }
}