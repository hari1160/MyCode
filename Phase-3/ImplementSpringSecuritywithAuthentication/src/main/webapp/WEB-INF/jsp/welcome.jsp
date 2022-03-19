<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org"
      xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <title>*****Welcome*****</title>
    </head>
    <body>
        <h1 th:inline="text" style="front:strong">Welcome to the page [[${#httpServletRequest.remoteUser}]]</h1>
        <form th:action="@{/logout}" method="post">
            <input  style="front:blue" type="submit" value="Sign Out"/ >
        </form>
    </body>
</html>