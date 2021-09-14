<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First JSP</title>
</head>
<body>
<h1>MVC Login Page</h1>
<form action="/spring-mvc/login" method="POST">
<p><font color="red">${errmsg}</font></p> 
Enter your UserName <input type="text" name="name"> <br>
Enter your Password <input type="password" name="password"> <input type="submit" value="Login">
</form>

</body>
</html>