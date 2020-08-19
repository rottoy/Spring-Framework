<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020-08-20
  Time: 오전 1:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">

    First name : <form:input path="firstName" />
        <br><br>
        Last name : <form:input path="lastName"/>
        <br><br>
        <input type="submit" value="submit" />

    </form:form>
</body>
</html>
