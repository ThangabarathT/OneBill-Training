<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<style>
input[type=submit]{
  background-color: #009933;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover{
  background-color: #45a049;
}
</style>
<body>
<h3>This is Home page</h3><br><br>
<%
out.println("Welcome back "+request.getParameter("username"));
%>
<br><br>
<form action="/ServletJSP/redirect" method="post">
<input type="submit" value="Go YouTube">
</form>
</body>
</html>