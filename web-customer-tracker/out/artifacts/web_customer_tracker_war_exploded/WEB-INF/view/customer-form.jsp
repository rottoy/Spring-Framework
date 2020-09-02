
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020-08-31
  Time: 오후 7:56
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>customer-form</title>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/myResources/css/style.css" />
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/myResources/css/add-customer-style.css" />
</head>
<body>

    <div id="wrapper">
        <div id="header">
            <h2>CRM - Customer Relationship Manager</h2>
        </div>
    </div>

    <div id="container">
        <h3> Save Customer</h3>
        <form:form action="saveCustomer" modelAttribute="customer" method="POST">
            <form:hidden path="id" />
            <table>
                <tbody>
                    <tr>
                        <td><label>First name:</label></td>
                        <td><form:input path="firstName"/> </td>
                    </tr>
                    <tr>
                        <td><label>Last name:</label></td>
                        <td><form:input path="lastName"/> </td>
                    </tr>
                    <tr>
                        <td><label>Email:</label></td>
                        <td><form:input path="email"/> </td>
                    </tr>
                    <tr>
                        <td><label></label></td>
                        <td><input type="submit" value="Save" class="save" /> </td>
                    </tr>
                </tbody>
            </table>
        </form:form>

        <div style="clear; both;">
            <p>
                <a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
            </p>
        </div>
    </div>
</body>
</html>
