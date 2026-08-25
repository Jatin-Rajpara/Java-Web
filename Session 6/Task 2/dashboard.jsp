<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>

<%
    String username = (String) session.getAttribute("username");
%>

<h2>Welcome, <%= username %>!</h2>

<p>You are successfully logged in.</p>

</body>
</html>