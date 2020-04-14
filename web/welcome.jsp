<%@ page import="java.sql.Connection" %>
<%@ page import="student.userdb" %>
<%
    response.setHeader("cache-control","no-cache,no-store,must-revalidate");
    response.setHeader("programa","no-cache");
    response.setHeader("Expires","0");
    if(session==null){
        response.sendRedirect("/login.jsp");
    }
%>
<%
        userdb user = (userdb) session.getAttribute("currentuser");

%>
<%--
  Created by IntelliJ IDEA.
  User: kirankakkera
  Date: 4/4/20
  Time: 3:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%

%>
<html>
<head>
    <title>welcome</title>
    <link href="wel.css" rel="stylesheet" type="text/css">
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>
<input type="checkbox" id="check">
<input type="checkbox" id="details_check">
<header>
    <label for="check">
        <i class="fa fa-bars" aria-hidden="true" id="navBar_btn"></i>
    </label>

    <h2>
        Student <span>Management</span>
    </h2>

</header>


    <div class="navBar">
        <a href="welcome.jsp">
            <i class="fa fa-home" aria-hidden="true"></i>
            <span>
               Home
        </span>

        </a>
        <a href="user.jsp">
            <i class="fa fa-user-circle-o" aria-hidden="true"></i>
            <span>
            User
        </span>

        </a>
        <a href="marks.jsp">
            <i class="fa fa-bar-chart" aria-hidden="true"></i>
            <span>
           Marks
        </span>
        </a>

</div>
<div class="user_detail">

        <a href="#" class="login_user">
            <i class="fa fa-user-circle-o" aria-hidden="true">
            <span>
                <label for="details_check" id="info_btn">
                <%=
                user.getFname()
                %>
            </span>
            </i>
        </a>

    </label>

    <a href="logout.jsp" class="logout">
        <i class="fa fa-sign-out" aria-hidden="true">
            <span>
                Logout
            </span>
        </i>
    </a>
</div>
 <div class="info">
     <a>

     <h3>
         Info
     </h3>

     <p>
         Name:<%=user.getFname()%>
         <%=user.getLname()%>
         <br>
         E-mail:<%=user.getEmail()%>

     </p>
     </a>

 </div>
<div class="content">

</div>




</body>
</html>
