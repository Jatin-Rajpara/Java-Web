package com.jatin.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/InstaRedirectServlet")
public class InstaRedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	
	PrintWriter out = response.getWriter();

        response.setStatus(302);

        out.println("Redirecting user to TrendingServlet");

        response.sendRedirect("TrendingServlet");
    }
}
