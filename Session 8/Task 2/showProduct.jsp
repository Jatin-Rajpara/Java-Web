<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Details</title>
</head>

<body>

    <h2>Product Details</h2>

    <jsp:useBean id="product" class="model.Product" scope="request" />

    <p>Product Name: <%= product.getName() %></p>
    <p>Product Price: <%= product.getPrice() %></p>

</body>
</html>