<%@ page import="java.text.MessageFormat" %><%--
  Created by IntelliJ IDEA.
  User: kirankakkera
  Date: 4/4/20
  Time: 11:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <%@include file="homepage.jsp"%>
    <link href="login.css" rel="stylesheet" type="text/css">


</head>
<body>

<div class="login-box">
    <h1>
        Login
    </h1>
    <h2>
        ${logout}
        ${success}
    </h2>
    <form method="post" action="/login">
        <div class="text-box">
            <label>
                <input type="text" name="username" placeholder="username" required>
            </label>
        </div>
            <br>
        <div class="text-box">

            <label>
                <input type="password" name="password" placeholder="password" required>
            </label>
        </div>
        <br>
        <h3>
            ${invalid}
        </h3>

        <div class="btn">
                <input type="submit" name="Login" value="Login">

        </div>




    </form>
</div>










</body>
</html>
