<%@ page contentType="text/html; 
charset=UTF-8" import="java.time.LocalDate" %>

<html>
<body>

<%
    String username = request.getParameter("username");
%>

<h2>Welcome, <%= username %>!</h2>

<p>Today's Date: <%= LocalDate.now() %></p>

</body>
</html>