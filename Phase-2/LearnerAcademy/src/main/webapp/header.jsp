<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align=center>Learner's Academy</h1>
	<a href="success.jsp">Dashboard</a>
	<% 
	
	String supername=(String)request.getSession(false).getAttribute("firstname");
	if(supername == null)
		{
		out.println("<a href=#>Login</a>");
		}
	else
		out.println("<a href=#>"+supername+"</a>");
	%>
	
	
	<a href="LogoutServlet">Logout</a>
</body>
</html>