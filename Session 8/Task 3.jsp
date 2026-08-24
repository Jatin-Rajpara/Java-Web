<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="product" class="com.jatin.model.Product" scope="session" />

<jsp:setProperty name="product" property="name" param="name" />
<jsp:setProperty name="product" property="price" param="price" />

<html>
<head>
    <title>Product Details</title>
</head>
<body>

<h2>Product Details</h2>

<p>Product Name: <%= product.getName() %></p>

<p>Product Price: <%= product.getPrice() %></p>

</body>
</html>

--> http://localhost:8080/YourProject/showProduct.jsp?name=Earbuds&price=1999
