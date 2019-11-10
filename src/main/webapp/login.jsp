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
login:
<input type="text", name="login">
<br>
<br>
password:
<input type="text", name="password">
<br>
<input type="submit", name="submit" value="submit">
</form>
</body>
</html>