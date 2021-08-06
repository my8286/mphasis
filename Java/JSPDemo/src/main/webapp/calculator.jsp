<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Answer</title>
</head>
<body>
<%

	String option=request.getParameter("button");
	int num1=Integer.parseInt(request.getParameter("num1"));
	int num2=Integer.parseInt(request.getParameter("num2"));
	if(option.equals("add"))
		out.println("Answer="+(num1+num2));
	else if(option.equals("minus"))
			out.println("Answer="+(num1-num2));
	else if(option.equals("mul"))
			out.println("Answer="+(num1*num2));
	if(option.equals("div"))
			out.println("Answer="+(num1/num2));
%>
</body>
</html>