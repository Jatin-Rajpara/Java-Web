package com.jatin.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TrendingSearchServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {

        ServletContext context = getServletContext();

        ArrayList<String> list = new ArrayList<>();

        list.add("Mobile");
        list.add("Laptop");
        list.add("Headphones");

        context.setAttribute("trending", list);
    }

    @Override
    protected void service(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        ServletContext context = getServletContext();

        ArrayList<String> list =
                (ArrayList<String>) context.getAttribute("trending");

        out.println("<h2>Trending Searches</h2>");

        for (String item : list) {
            out.println(item + "<br>");
        }
    }
}