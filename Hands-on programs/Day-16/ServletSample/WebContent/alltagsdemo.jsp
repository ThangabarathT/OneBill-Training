<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- JSP Comment --%>
<!-- HTML Comment -->
<% out.prinln(" A simple JSP file"); %>
<%! int num1=100,num2=200; %>
<%= num1*num2 %>
<% Date d= new Date(); %>
Today's date : <%=d.toString() %>
</body>
</html>