<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<%@ include file="header.jsp" %>

<%
if(request.getSession(false).getAttribute("username")==null)
	response.sendRedirect("login.jsp");
%>

	<% String uname=(String)request.getSession(false).getAttribute("firstname"); 
		out.println("<h1>Welcome "+uname+"</h1>");
	
	%>
	
	<h2 id="messagespace" style="color: green;font-weight: bold;"></h2>
	
	<a href="add_student.jsp">Add Student</a><br/>
	<a href="add_teacher.jsp">Add Teacher</a><br/>
	<a href="add_subject.jsp">Add Subject</a><br/><br/><br/>
	
	<a href="delete_student.jsp">Remove Student</a><br/>
	<a href="delete_teacher.jsp">Remove Teacher</a><br/>
	<a href="delete_subject.jsp">Remove Subject</a><br/><br/><br/>
	
	
	<a href="show_student.jsp">Show All Students</a><br/>
	<a href="show_teacher.jsp">Show All Teachers</a><br/>
	<a href="show_subjects.jsp">Show All Subjects</a><br/>
	<a href="show_classes.jsp">Show All Class</a><br/><br/><br/>
	
	<a href="assign_student.jsp">Assign Students to Class</a><br/>
	<a href="assign_teacher.jsp">Assign Teachers to Class</a><br/>
	<a href="assign_subject.jsp">Assign Subjects to Class</a><br/><br/><br/>
	
	<a href="class_report.jsp">Class Report</a>
	<%@ include file="footer.jsp" %>
	
</body>
</html>