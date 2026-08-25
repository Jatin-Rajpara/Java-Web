<!DOCTYPE html>
<html>
<head>
    <title>Profile</title>
</head>
<body>

<%
    String username = (String) request.getAttribute("username");
%>

<h2>Welcome, <%= username %>!</h2>

<p>This is your profile page.</p>

</body>
</html>