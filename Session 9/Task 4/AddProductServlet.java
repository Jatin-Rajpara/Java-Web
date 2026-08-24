
package com.jatin.servlets;

import java.io.IOException;

import com.jatin.model.Product;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/addProduct")
public class AddProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));

        Product product = new Product(id, name, price);

        HttpSession session = request.getSession();
        session.setAttribute("product", product);

        RequestDispatcher rd =
                request.getRequestDispatcher("showProduct.jsp");

        rd.forward(request, response);
    }
}

