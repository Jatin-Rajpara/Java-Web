<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.jatin.model.Product" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Details</title>
</head>

<body>

    <h2>Product Details</h2>

    <%
        Product p = (Product) session.getAttribute("product");
    %>

    <table border="1" cellpadding="10">

        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Category</th>
        </tr>

        <tr>
            <td><%= p.getId() %></td>
            <td><%= p.getName() %></td>
            <td><%= p.getPrice() %></td>
            <td><%= p.getCategory() %></td>
        </tr>

    </table>

</body>
</html>