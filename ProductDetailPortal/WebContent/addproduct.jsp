<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
    String ID=request.getParameter("ID");
	String name=request.getParameter("name");
	String price=request.getParameter("price");
%>

<jsp:useBean id="obj" class="com.simplilearn.Product" scope="session"></jsp:useBean>

<!-- call getter Property -->
<h3>Value before setting up a property</h3>
Id: <jsp:getProperty property="ID" name="obj"/><br>
Name: <jsp:getProperty property="name" name="obj"/><br>
Price: <jsp:getProperty property="price" name="obj"/><br>

<!-- Set property -->
<jsp:setProperty property="ID" name="obj"/>
<jsp:setProperty property="name" name="obj"/>
<jsp:setProperty property="price" name="obj"/>

<h3>Value After setting up a property</h3>
Id: <jsp:getProperty property="ID" name="obj"/><br>
Name: <jsp:getProperty property="name" name="obj"/><br>
Price: <jsp:getProperty property="price" name="obj"/><br>
</body>
</html>