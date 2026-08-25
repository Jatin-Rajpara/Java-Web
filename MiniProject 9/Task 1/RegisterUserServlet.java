package com.jatin.servlets;

import java.io.IOException;

import com.jatin.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@WebServlet("/reg")
public class RegisterUserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest rs, HttpServletResponse rp)
            throws ServletException, IOException {

        String username = rs.getParameter("unm");
        String email = rs.getParameter("email");
        String password = rs.getParameter("pass");

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        Transaction tr = session.beginTransaction();

        User u = new User(username, email, password);

        session.persist(u);

        tr.commit();

        session.close();
        factory.close();

        rp.getWriter().println("User Registered Successfully!");

    }
}