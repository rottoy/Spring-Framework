<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020-08-31
  Time: 오후 2:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <div id="wrapper">
            <div id="header">
                <h2>CRM - Customer Relation Manager</h2>
            </div>
        </div>
    <div id="content">
        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
            </tr>

        <c:forEach var="tempCustomer" items="${customerList}">
            <tr>
                <td>${tempCustomer.firstName}</td>
                <td>${tempCustomer.lastName}</td>
                <td>${tempCustomer.email}</td>
            </tr>

        </c:forEach>
        </table>
    </div>


</body>
</html>
