<%@ page import="java.util.List" %>
<%@ page import="com.jatin.model.Product" %>

<!DOCTYPE html>
<html>
<head>
    <title>Products</title>
</head>
<body>

<h2>Product List</h2>

<table border="1">

    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
    </tr>

<%
    List<Product> productList =
            (List<Product>) request.getAttribute("productList");

    for (Product p : productList) {
%>

    <tr>
        <td><%= p.getId() %></td>
        <td><%= p.getName() %></td>
        <td><%= p.getPrice() %></td>
    </tr>

<%
    }
%>

</table>

</body>
</html>