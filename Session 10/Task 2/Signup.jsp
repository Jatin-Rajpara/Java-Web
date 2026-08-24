<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Signup Form</title>
</head>

<body>

    <h2>Signup Form</h2>

    <%
        String error = (String) request.getAttribute("error");

        if (error != null) {
    %>
        <p style="color: red;"><%= error %></p>
    <%
        }
    %>

    <form action="signup" method="post">

        Username:
        <input type="text" name="username">
        <br><br>

        Email:
        <input type="text" name="email">
        <br><br>

        Password:
        <input type="password" name="password">
        <br><br>

        <input type="submit" value="Signup">

    </form>

</body>
</html>