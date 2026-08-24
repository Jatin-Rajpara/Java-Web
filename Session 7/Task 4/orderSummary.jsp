<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
    <title>Order Summary</title>
</head>
<body>

<h2>Order Summary</h2>

<p>Item Name: ${itemName}</p>

<p>Quantity: ${quantity}</p>

<p>Price: ₹${price}</p>

<p>Total Cost: ₹${quantity * price}</p>

</body>
</html>