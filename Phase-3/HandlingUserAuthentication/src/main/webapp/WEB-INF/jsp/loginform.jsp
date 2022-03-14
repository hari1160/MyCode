<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
	<h2 style="text-align: center">Login Page</h2>
	
	<div style="color:red;">
	${error} 
	
	</div>
		
	
	<form action="loginform" method='post'>

		<label for="username">Name:</label><br>
		 <input type="text" id="username" placeholder="Name" name="username" required><br>
		<br> <label for="password">Password:</label><br>
		 <input type="text" id="password" placeholder="Password" name="password" required><br>
		<br> <input type="submit" value="Submit">
	</form>
</body>
</html>