<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="/menu.jsp" %>
<br>

<c:forEach items="${users}" var="user">
    ${user.login}
    ${user.name}
    ${user.email}
    <br>
</c:forEach>

</body>
</html>
