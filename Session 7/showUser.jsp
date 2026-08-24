<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
    <title>User Welcome</title>
</head>
<body>

<%
    String username = request.getParameter("username");
%>

<h2>Welcome, <%= username %>!</h2>

</body>
</html>