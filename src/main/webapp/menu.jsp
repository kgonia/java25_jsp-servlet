<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.sda.java25.trainings2.users.LoginServlet" %>

<a href="/users/addUser.jsp">Add User</a>
<a href="/userslist">Users</a>
<a href="/courses/addCourse.jsp">Add Course</a>
<a href="/courseslist">Courses</a>

<c:if test="${not empty sessionScope.get(LoginServlet.USER_SESSION_KEY)}">
    <form method="post" action="/logout">
        <input type="submit" value="Wyloguj">
    </form>
</c:if>

