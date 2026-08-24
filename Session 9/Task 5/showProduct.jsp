
<%@ page import="java.util.List" %>
<%@ page import="com.jatin.model.Product" %>

<html>
<head>
    <title>Product List</title>
</head>
<body>

<h2>Registered Products</h2>

<%
    List<Product> products =
        (List<Product>) session.getAttribute("products");
%>

<%
    if (products != null) {

        for (Product product : products) {
%>

            <p>Product ID: <%= product.getId() %></p>
            <p>Product Name: <%= product.getName() %></p>
            <p>Product Price: <%= product.getPrice() %></p>

            <hr>

<%
        }
    }
%>

</body>
</html>

