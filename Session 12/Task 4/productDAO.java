package com.jatin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jatin.model.Product;

public class ProductDAO {

    public List<Product> getAllProducts() {

        List<Product> productList = new ArrayList<>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/shop_db",
                    "jatin",
                    "1234"
            );

            String sql = "SELECT * FROM products";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int price = rs.getDouble("price");

                Product p = new Product(id, name, price);

                productList.add(p);
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return productList;
    }
}