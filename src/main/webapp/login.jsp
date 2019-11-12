<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <meta charset="UTF-8">
    <title>login</title>
</head>
<body>
<form method="post">
<h3>Enter Your Login And Password</h3>
<br>
    <form:form method="POST" action="postRequest" modelAttribute="user">
    login:
        <form:input path="login"/>
        <br>
        <br>
        password:
        <form:input path="password"/>
        <br>
<input type="submit", name="submit" value="submit">
    </form:form>
</form>
</body>
</html>