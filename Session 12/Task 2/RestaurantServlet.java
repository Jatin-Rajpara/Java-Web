package com.jatin.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RestaurantServlet")
public class RestaurantServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String cuisine = req.getParameter("cuisine");

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/food_db",
                    "jatin",
                    "1234"
            );

            String sql = "INSERT INTO restaurants(name, cuisine) VALUES(?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, cuisine);

            ps.executeUpdate();

            ps.close();
            con.close();

            resp.getWriter().println("Restaurant Added Successfully!");

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}