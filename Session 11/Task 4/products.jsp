<%@ page import="java.util.List" %>
<%@ page import="com.jatin.model.Product" %>

<!DOCTYPE html>
<html>
<head>
    <title>Products</title>
</head>
<body>

<h2>Product List</h2>

<form action="ProductListServlet" method="get">

    Search Product:
    <input type="text" name="name">

    <input type="submit" value="Search">

</form>

<br>

<%
    String error = (String) request.getAttribute("error");

    if (error != null) {
%>

    <p style="color:red;">
        <%= error %>
    </p>

<%
    } else {
%>

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

<%
    }
%>

</body>
</html>