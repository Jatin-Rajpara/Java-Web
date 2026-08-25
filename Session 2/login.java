package com.jatin.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/lOGIN")
public class login extends HttpServlet {

    protected void doPost(HttpServletRequest rs, HttpServletResponse rp)
    throws ServletException, IOException{

        rp.setContentType("text/html");
        PrintWriter out = rp.getWriter();
        String name= rs.getParameter("nm");
        String pass= rs.getParameter("pass");

        if(name.equals(pass)){
        out.println("Welcome <b>"+name);
        }
        else{
            out.println("Invalid....");
        }
    }
}
