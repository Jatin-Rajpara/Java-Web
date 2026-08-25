<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
    <title>My Playlists</title>
</head>
<body>

<h2>My Favorite Spotify Playlists</h2>

<%
    List<String> playlists =
            (List<String>) request.getAttribute("playlists");

    for (String playlist : playlists) {
%>

    <p><%= playlist %></p>

<%
    }
%>

</body>
</html>