package com.jatin.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PlaylistServlet")
public class PlaylistServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String Id = request.getParameter("playlistId");

        RequestDispatcher dispatcher =
                request.getRequestDispatcher("/PlaylistDetailsServlet");

        dispatcher.forward(request, response);
    }
}
