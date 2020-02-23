<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="/menu.jsp"%>

<h2>Obecne kursy</h2>
<br>

<c:forEach items="${courses}" var="course">
    ${course.name}
    ${course.maxParticipants}
    ${course.price}
    <form method="post" action="/deleteCourse">
        <input type="hidden" name="name" value="${course.name}">
        <input type="submit" value="Usuń">
    </form>
    <br>
</c:forEach>

</body>
</html>
