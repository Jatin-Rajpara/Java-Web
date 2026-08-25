<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<body>

<%
    String username = (String) session.getAttribute("username");
%>

<h2>Welcome, <%= username %>!</h2>

<p>Login Successful.</p>

</body>
</html>