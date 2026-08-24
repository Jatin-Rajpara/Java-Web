
package com.jatin.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("admin") && password.equals("123456")) {

            response.getWriter().println("<h2>Login Successful</h2>");

        } else {

            request.setAttribute("error", "Invalid Credentials");

            RequestDispatcher rd =
                    request.getRequestDispatcher("login.jsp");

            rd.forward(request, response);
        }
    }
}
