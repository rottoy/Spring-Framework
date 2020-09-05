<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020-09-04
  Time: 오후 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>luv2code Company Home Page</title>
</head>
<body>
    <h2>luv2code Company Home Page</h2>
    <p>Welcome to the luv2code company home page!</p>

    <hr>

    <security:authorize access="hasRole('MANAGER')">


    <!--Add a link to point to /leaders ... this is for mananger -->
    <p>
        <a href = "${pageContext.request.contextPath}/leaders">LeaderShip Meeting</a>
        (Only for Manager peeps)
    </p>
    </security:authorize>

    <security:authorize access="hasRole('ADMIN')">
    <!--Add a link to point to /systems ... this is for Admin -->
    <p>

        <a href = "${pageContext.request.contextPath}/systems">Systems Meeting</a>
        (Only for Admin peeps)
    </p>
    </security:authorize>
    <!--display user name and role -->
    <p>
        User : <security:authentication property="principal.username" />
        <br><br>
        Roles : <security:authentication property="principal.authorities"/>

    </p>
    <!-- Add a logout button -->
    <form:form method="post" action="${pageContext.request.contextPath}/logout">
        <input type="submit" value="logout" />

    </form:form>


</body>
</html>
