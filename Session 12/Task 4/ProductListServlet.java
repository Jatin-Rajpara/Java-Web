package com.jatin.servlets;

import java.io.IOException;
import java.util.List;

import com.jatin.dao.ProductDAO;
import com.jatin.model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ProductListServlet")
public class ProductListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ProductDAO dao = new ProductDAO();

        List<Product> productList = dao.getAllProducts();

        req.setAttribute("productList", productList);

        req.getRequestDispatcher("products.jsp")
           .forward(req, resp);
    }
}