
package com.jatin.servlets;

import java.io.IOException;
import java.io.PrintWriter;

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

	 if (username == null || username.isEmpty() ||
	     email == null || email.isEmpty() ||
	     password == null || password.isEmpty()) {

 	   request.setAttribute("error", "All fields are required.");

 	    RequestDispatcher rd =
            request.getRequestDispatcher("signup.jsp");

	    rd.forward(request, response);
  	  return;
	}

 
        if (password.length() < 6) {

            request.setAttribute("error",
                    "Password must be at least 6 characters.");

            RequestDispatcher rd =
                    request.getRequestDispatcher("signup.jsp");

            rd.forward(request, response);
            return;
        }

     
        if (!email.contains("@") || !email.endsWith(".com")) {

            request.setAttribute("error",
                    "Invalid email format.");

            RequestDispatcher rd =
                    request.getRequestDispatcher("signup.jsp");

            rd.forward(request, response);
            return;
        }

        
        PrintWriter out = response.getWriter();

        out.println("<h2>Signup Successful</h2>");
        out.println("Username: " + username);
        out.println("<br>Email: " + email);
    }
}

