package com.jatin.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThemeServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String df =
                getServletContext().getInitParameter("app");

        String theme = request.getParameter("theme");

        if (theme == null || theme.isEmpty()) {
            theme = df;
        }

        out.println("<h2>Current Theme : " + theme + "</h2>");
    }
}