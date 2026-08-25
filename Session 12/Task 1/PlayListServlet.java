package com.jatin.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PlaylistServlet")
public class PlaylistServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<String> playlists = new ArrayList<>();

        playlists.add("My Chill Playlist");
        playlists.add("Workout Music");
        playlists.add("Best Bollywood Songs");

        req.setAttribute("playlists", playlists);

        req.getRequestDispatcher("Playlist.jsp").forward(req, resp);
    }
}