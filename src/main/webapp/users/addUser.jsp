<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.sda.java25.trainings2.users.AddUserServlet" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="/adduser">
    <input name="name" placeholder="Imie">
    <input name="${AddUserServlet.PARAM_LOGIN_NAME}" placeholder="Login">
    <input name="email" type="email" placeholder="Email">
    <input name="password" type="password" placeholder="Hasło">
    <input type="submit" value="Zarejestruj się">
</form>

</body>
</html>
