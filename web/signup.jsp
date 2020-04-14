<%--
  Created by IntelliJ IDEA.
  User: kirankakkera
  Date: 4/4/20
  Time: 12:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="homepage.jsp"%>
    <title>signup</title>
    <link href="signup.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="signup_box">
    <h1>
        Signup
    </h1>
    <form method="post" action="./signupuser">
        <div class="textBox">
            <label>
                <input type="text" name="fname" placeholder="Enter First Name" required>
            </label>
        </div>
        <br>
        <div class="textBox">
            <label>
                <input type="text" name="lname" placeholder="Enter Last name">
            </label>
        </div>
        <br>
        <div class="textBox">
            <label>
                <input type="email" name="email" placeholder="Enter E-mail" required>
            </label>
        </div>
        <br>
        <div class="textBox">
            <label>
                <input type="password" name="password" placeholder="Enter Password" required>
            </label>
        </div>
        <p>${pass}</p>
        <div class="textBox">
            <label>
                <input type="password" name="repassword" placeholder="Re-Enter Password" required>
            </label>
        </div>
        <br>

        <div class="sign_btn">
            <input type="submit" name="signup" value="Signup">
        </div>





</form>


</div>



</body>
</html>
