package com.jatin.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FeedbackServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String orderId = request.getParameter("orderid");
        String feedback = request.getParameter("feedback");

        if (name == null || name.trim().isEmpty()
                || orderId == null || orderId.isEmpty()
                || feedback == null || feedback.isEmpty()) {

            out.println("<h2 style='color:red;'>Error!</h2>");
            out.println("<p>Please fill all the fields.</p>");

        } else {

            out.println("<h2>Thank You!</h2>");
            out.println("<p>Name : " + name + "</p>");
            out.println("<p>Order ID : " + orderId + "</p>");
            out.println("<p>Feedback : " + feedback + "</p>");
        }
    }
}