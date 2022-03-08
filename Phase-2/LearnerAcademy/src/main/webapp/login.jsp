<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<%@ include file = "header.jsp" %>
	<form action="<%=request.getContextPath()%>/loginservlet" method="post">
            <div class="form-group">
                <label for="user_name">User Name:</label> <input type="text"
                    class="form-control" id="user_name" placeholder="User Name"
                    name="username" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label> <input type="password"
                    class="form-control" id="password" placeholder="Password"
                    name="password" required>
            </div>
            <div class="form-group">
            <a href="signup.jsp">SignUp</a>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
       </form>
       <%@ include file = "footer.jsp" %> 
</body>
</html>