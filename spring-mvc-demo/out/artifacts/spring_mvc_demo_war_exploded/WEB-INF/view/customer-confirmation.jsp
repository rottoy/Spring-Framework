<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020-08-20
  Time: 오후 8:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body>
The customer is confirmed : ${customer.firstName} ${customer.lastName}
Customer Free passes : ${customer.freePasses}
Customer Postal Code : ${customer.postalCode}
</body>
</html>
