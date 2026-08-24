
package com.jatin.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
        double price = Double.parseDouble(request.getParameter("price"));

        Product product = new Product(id, name, price);

        HttpSession session = request.getSession();

        List<Product> products =
                (List<Product>) session.getAttribute("products");

        if (products == null) {
            products = new ArrayList<>();
        }

        products.add(product);

        session.setAttribute("products", products);

        RequestDispatcher rd =
                request.getRequestDispatcher("showProduct.jsp");

        rd.forward(request, response);
    }
}

