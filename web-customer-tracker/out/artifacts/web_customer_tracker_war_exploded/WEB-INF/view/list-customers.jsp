<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020-08-30
  Time: 오후 8:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List Customers</title>

    <!-- reference our style sheet -->
    <!--상대 경로가 아닌 절대 경로-->
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/myResources/css/style.css" />

</head>
<body>

    <div id="wrapper">
        <div id="header">
            <h2>CRM - Customer Relation Manager</h2>
        </div>
    </div>

    <div id = "container">
        <div id="content">
            ${pageContext.request.contextPath}
            <!-- add out html table here -->

            <table>
                <tr>
                   <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                </tr>

                <!-- loop over and print our customers -->
                <c:forEach var="tempCustomer" items="${customers}">
                    <tr>
                        <td>${tempCustomer.firstName}</td>
                        <td>${tempCustomer.lastName}</td>
                        <td>${tempCustomer.email}</td>
                    </tr>
                </c:forEach>
            </table>

        </div>
    </div>

</body>
</html>
