<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
<%
String name = request.getParameter("username");
String pass = request.getParameter("password");
if(name.equals("Thangam") && pass.equals("1234")){
	RequestDispatcher rd = request.getRequestDispatcher("/home");
	rd.forward(request, response);
}else{
	out.println("Invalid Username and Password");
	RequestDispatcher rd = request.getRequestDispatcher("login.html");
	rd.include(request, response);
}
%>
</body>
</html>