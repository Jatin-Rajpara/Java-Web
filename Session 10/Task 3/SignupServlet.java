
package com.jatin.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (email == null || email.isEmpty() ||
            !email.contains("@") || !email.endsWith(".com")) {

            request.setAttribute("emailError",
                    "Please enter a valid email address.");

            RequestDispatcher rd =
                    request.getRequestDispatcher("signup.jsp");

            rd.forward(request, response);
            return;
        }

        response.getWriter().println("<h2>Signup Successful</h2>");
    }
}
