package com.jatin.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        if (session != null) {

            String username =
                    (String) session.getAttribute("username");

            if (username != null) {

                resp.setContentType("text/html");

                resp.getWriter().println("<h2>Welcome, "
                        + username + "!</h2>");

            } else {

                resp.sendRedirect("login.html");
            }

        } else {

            resp.sendRedirect("login.html");
        }
    }
}