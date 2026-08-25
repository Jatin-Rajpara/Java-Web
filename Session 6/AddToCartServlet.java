package com.jatin.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String item = req.getParameter("item");

        Cookie cookie = new Cookie("cartItem", item);

        cookie.setMaxAge(10 * 60);

        resp.addCookie(cookie);

        resp.getWriter().println(
                "<h2>" + item + " added to cart!</h2>"
        );
    }
}