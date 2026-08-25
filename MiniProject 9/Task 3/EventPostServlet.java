package com.jatin;

import java.io.IOException;

import com.jatin.entity.Event;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@WebServlet("/EventPostServlet")
public class EventPostServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String title = req.getParameter("title");
        String date = req.getParameter("date");
        String description = req.getParameter("description");

	try{ 
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tr = session.beginTransaction();

        Event e = new Event(title, date, description);

        session.persist(e);

        tr.commit();

        session.close();
        factory.close();

        resp.getWriter().println("Event Posted Successfully!");
      }
	 catch (Exception e) {

            resp.getWriter().println("Event Post Failed!");
            }

    }
}