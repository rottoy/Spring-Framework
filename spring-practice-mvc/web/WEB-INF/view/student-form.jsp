<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020-08-21
  Time: 오후 5:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>student-form</title>
</head>
<body>

     <form:form action="processForm" modelAttribute="model_student">
         ID : <form:input path="id"/>
         <br><br>
         PASSWORD: <form:input path="password"/>
         <br><br>
         Country :
         <form:select path="country">
            <form:options items="${model_countryOptions}"/>
         </form:select>
         <br><br>
         <form:radiobuttons path="language" items="${model_student.languageOptions}"/>
         <br><br>

         Linux : <form:checkbox path="operatingSystems" value="Linux"/>
         Ubuntu : <form:checkbox path="operatingSystems" value="Ubuntu"/>
         Windows : <form:checkbox path="operatingSystems" value="Windows"/>
         Mac OS : <form:checkbox path="operatingSystems" value="Mac OS"/>

         <input type="submit" value="submit"/>
     </form:form>
<!--
    <form action="processFormVersionThree" method="get">
        ID :<input type="text" name="studentId" placeholder="id를 입력하세요."/>

        <br><br>

        Password : <input type="text" NAME="studentPassword" placeholder="비밀번호를 입력하세요."/>


        <input type="submit"/>
    </form>
    -->
</body>
</html>
