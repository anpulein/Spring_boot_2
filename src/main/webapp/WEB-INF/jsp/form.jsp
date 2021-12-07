<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Dear Employee, Please enter your details</h2>

<br>
<br>

<form:form action="/showDetails" modelAttribute="employee" method="post">

    Name <form:input path="name" />
    <br><br>
    Surname <form:input path="surname" />
    <br><br>
    Salary <form:input path="salary" />
    <br><br>
    Departament <form:input path="departament" />

    <input type="submit" value="OK">

</form:form>

</body>
</html>
