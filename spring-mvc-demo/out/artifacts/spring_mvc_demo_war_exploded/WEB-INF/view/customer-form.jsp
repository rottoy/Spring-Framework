<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020-08-20
  Time: 오후 8:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Registration Form</title>
    <style>
        .error {color:red;}

    </style>
</head>
<body>
Fill out the form. Asterisk (*) means required.

<br><br>

<form:form action="processForm" modelAttribute="customer">
    First name : <form:input path="firstName" />

    <br><br>

    Last name (*): <form:input path="lastName" />
    <form:errors path="lastName" cssClass="error"/>
    <br><br>
    <input type="submit" value="submit">
</form:form>
</body>
</html>
