<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>

<%
    String username = (String) session.getAttribute("username");

    if (username != null) {
%>

    <h2>Welcome, <%= username %>!</h2>

    <p>You are logged in.</p>

    <form action="LogoutServlet" method="post">
        <input type="submit" value="Logout">
    </form>

<%
    } else {
%>

    <h2>Session Expired</h2>
    <a href="login.html">Login Again</a>

<%
    }
%>

</body>
</html>