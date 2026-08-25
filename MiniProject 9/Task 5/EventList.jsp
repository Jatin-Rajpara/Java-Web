<%@ page import="java.util.List" %>
<%@ page import="com.jatin.model.Event" %>

<!DOCTYPE html>
<html>
<head>
    <title>Events List</title>
</head>
<body>

<h2>All Events</h2>

<%
    List<Event> eventList =
            (List<Event>) request.getAttribute("eventList");

    for (Event e : eventList) {
%>

    <h3><%= e.getTitle() %></h3>

    <p>
        <b>Date:</b> <%= e.getDate() %>
    </p>

    <p>
        <b>Description:</b> <%= e.getDescription() %>
    </p>

    <hr>

<%
    }
%>

</body>
</html>