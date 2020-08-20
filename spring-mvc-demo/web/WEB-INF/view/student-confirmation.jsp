<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020-08-20
  Time: 오전 1:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>

The student is confirmed : ${student.firstName} ${student.lastName}
<br><br>
Country : ${student.country}

<br><br>

Language : ${student.favoriteLanguage}

<br><br>

Operating Systems :

<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li> ${temp} </li>

    </c:forEach>

</ul>
</body>
</html>
