<!DOCTYPE html>
<html>
<head>
    <title>Post Event</title>
</head>
<body>

<h2>Post New Event</h2>

<form action="EventPostServlet" method="post">

    Event Title:
    <input type="text" name="title">
    <br><br>

    Event Date:
    <input type="date" name="date">
    <br><br>

    Description:
    <br>
    <textarea name="description" rows="5" cols="40"></textarea>
    <br><br>

    <input type="submit" value="Post Event">

</form>

</body>
</html>