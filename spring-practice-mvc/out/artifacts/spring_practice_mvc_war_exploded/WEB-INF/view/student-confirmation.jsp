<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020-08-21
  Time: 오후 5:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student Confirmed</title>
</head>
<body>
    아이디는 ${model_student.id} 입니다.

    <br><br>
    비밀번호는 ${model_student.password} 입니다.

    <br><br>
    언어는 ${model_student.language} 입니다.

    <br><br>
    운영체제는
    <c:forEach var="temp" items="${model_student.operatingSystems}">
        <li> ${temp} </li>
    </c:forEach>
    입니다.
</body>
</html>
