<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add subject</title>
</head>
<body>
<%
if(request.getSession(false).getAttribute("username")==null)
	response.sendRedirect("login.jsp");
%>
<%@ include file = "header.jsp" %>
<h1>Add Subject</h1>

<form action="addsubjectservlet">
<h4>Enter Subject Name</h4>
<input type="text" name="subject_name" placeholder="Subject Name" required>
<h4>Select intended class</h4>
<select name="subject_class" required="required">
<option>Select</option>
<option value="">Select Here</option>
<option value="I">I</option>
<option value="II">II</option>
<option value="III">III</option>
<option value="IV">IV</option>
</select>
<br/>
<br/>
<br/>
<input type="submit" value="Add Subject">

</form>
<%@ include file="footer.jsp" %>
</body>
</html>