
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="/menu.jsp"%>

<form method="post" action="/addcourse">
    <input name="name" placeholder="Nazwa kursu">
    <input name="participants" placeholder="Max uczetników">
    <input name="price" placeholder="Cena">
    <input type="submit" value="Dodaj kurs">
</form>
</body>
</html>
