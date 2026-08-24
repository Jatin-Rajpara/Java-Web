<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="product"
             class="com.jatin.model.Product"
             scope="session" />

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Details</title>
</head>
<body>

<h2>Product Details</h2>

<p>Product ID: <%= product.getId() %></p>

<p>Product Name: <%= product.getName() %></p>

<p>Price: ₹<%= product.getPrice() %></p>

<p>Category: <%= product.getCategory() %></p>

</body>
</html>