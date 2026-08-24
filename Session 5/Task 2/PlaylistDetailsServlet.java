package com.jatin.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PlaylistDetailsServlet")
public class PlaylistDetailsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String Id = request.getParameter("playlistId");

        response.setContentType("text/html");

        response.getWriter().println("<h1>Playlist Details</h1>");
        response.getWriter().println("<p>Playlist ID: " + Id + "</p>");
    }
}
