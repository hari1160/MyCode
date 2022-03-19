<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
	xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<head>
<title>Dashboard</title>
</head>
<body>
	<h1 style="front:strong">Welcome to Spring Security</h1>

	<p>
		Click <a th:href="@{/welcome}" style="color:red">here</a> to get login page.
	</p>
</body>
</html>