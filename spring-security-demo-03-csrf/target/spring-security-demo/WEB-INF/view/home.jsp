<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

    <!-- Add a logout button -->
    <form:form method="post" action="${pageContext.request.contextPath}/logout">
        <input type="submit" value="logout" />

    </form:form>


</body>
</html>
