<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
    <title>Signup Form</title>
</head>
<body>

<h2>Signup Form</h2>

<form action="signup" method="post">

    Username:
    <input type="text" name="username">
    <br><br>

    Email:
    <input type="text" name="email">
    
    <%
        String emailError = (String) request.getAttribute("emailError");

        if (emailError != null) {
    %>
        <p style="color:red;"><%= emailError %></p>
    <%
        }
    %>

    <br>

    Password:
    <input type="password" name="password">
    <br><br>

    <input type="submit" value="Signup">

</form>

</body>
</html>

