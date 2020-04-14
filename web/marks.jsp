<%@ page import="java.sql.*" %>
<%@ page import="student.userdb" %>
<%
    if(session==null){
        response.sendRedirect("./login.jsp");
    }
%>
<%--
  Created by IntelliJ IDEA.
  User: kirankakkera
  Date: 4/10/20
  Time: 3:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Marks</title>
    <%@ include file="welcome.jsp"%>
    <link href="marks.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="marks_sheet">
    <h1><%=user.getFname()%></h1>
    <table>
        <tr>
            <td>
                subject
            </td>
            <td>
                Mathematics
            </td>
            <td>
                Physics
            </td>
            <td>
                Chemistry
            </td>
            <td>
                Total
            </td>
        </tr>
        <tr>
            <td>
                CAT - 1
            </td>
            <td>
                <%=user.getSubject1()%>
            </td>
            <td>
                <%=user.getSubject2()%>
            </td>
            <td>

                <%=user.getSubject3()%>
            </td>
            <td>
                <%=user.getSubject1()+user.getSubject2()+user.getSubject3()%>
            </td>


        </tr>
    </table>

</div>
</body>
</html>
