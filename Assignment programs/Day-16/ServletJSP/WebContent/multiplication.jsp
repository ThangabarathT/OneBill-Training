<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Multiplication Table</title>
</head>

<body>
<%! int multiplier,len, result;%>
<%
String mul = request.getParameter("multiplier");
String tab = request.getParameter("table");
if((mul.equals("")||mul==null) && (tab.equals("")||tab==null)){
	RequestDispatcher rd = request.getRequestDispatcher("Multiplication.html");
	rd.include(request, response);
}else{
	multiplier = Integer.parseInt(mul);
	len = Integer.parseInt(tab);
	for(int i=1; i<=len;i++){
		result = i * multiplier;
		out.println(i+" x "+multiplier+" = "+result+"<br><br>");
	}
	out.println("Multiplication table generated successfully<br><br>");
}
%>
<form action="/ServletJSP/Multiplication.html">
<input type="submit" value="Go Back">
</form>
</body>
</html>