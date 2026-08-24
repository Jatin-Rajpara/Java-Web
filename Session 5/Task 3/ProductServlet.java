package com.jatin.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String productId = request.getParameter("productId");

        response.setContentType("text/html");

        if (productId == null || productId.isEmpty()) {

            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.getWriter().println("Product not found");

        } else {

            response.setStatus(HttpServletResponse.SC_OK);
            response.getWriter().println("Product details for " + productId);
        }
    }
}