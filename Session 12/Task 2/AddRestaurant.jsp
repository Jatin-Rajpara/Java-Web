<!DOCTYPE html>
<html>
<head>
    <title>Add Restaurant</title>
</head>
<body>

<h2>Add Restaurant</h2>

<form action="RestaurantServlet" method="post">

    Restaurant Name:
    <input type="text" name="name">
    <br><br>

    Cuisine Type:
    <input type="text" name="cuisine">
    <br><br>

    <input type="submit" value="Add Restaurant">

</form>

</body>
</html>



<!--
CREATE DATABASE food_db;

USE food_db;

CREATE TABLE restaurants (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    cuisine VARCHAR(100)
);
-->