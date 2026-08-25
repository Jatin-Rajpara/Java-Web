package com.jatin.servlet;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WelcomeUserServlet extends HttpServlet {

    private String appName;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        appName = config.getInitParameter("appName");

        System.out.println("init() method is called");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("service() method is called");

        resp.setContentType("text/html");

        resp.getWriter().println("<h1>Welcome to " + appName + "</h1>");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() method is called");
    }
}