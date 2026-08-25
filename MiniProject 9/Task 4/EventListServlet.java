package com.jatin.servlets;

import java.io.IOException;
import java.util.List;

import com.jatin.entity.Event;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

@WebServlet("/EventListServlet")
public class EventListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        try {

            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");

            SessionFactory factory = cfg.buildSessionFactory();
            Session session = factory.openSession();

            List<Event> eventList =
                    session.createQuery("from Event", Event.class).getResultList();

            req.setAttribute("eventList", eventList);

            session.close();
            factory.close();

            req.getRequestDispatcher("EventsList.jsp").forward(req, resp);

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}