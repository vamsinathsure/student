<%@ page import="java.sql.*" %>
<%@ page import="student.userdb" %>
<%@ page import="student.connection" %>
<%

    userdb u=(userdb)session.getAttribute("currentuser");
    if(u==null){
        response.sendRedirect("./login.jsp");
    }
%><%--
  Created by IntelliJ IDEA.
  User: kirankakkera
  Date: 4/6/20
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.FileInputStream" %>
<%@ page import="java.io.File" %>

<html>
<head>
    <title>User</title>
    <%@include file="welcome.jsp"%>
    <link href="user.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="user">
    <h1 style="align-content: center">Student Details</h1>
    <h3 style="align-content: center"><%=u.getFname()%> </h3>
    <div class="image_view">
        <img src="./updateUser" width="100px" height="100px">
    </div>
    <br>
    <form method="post" action="user.jsp">
        <div class="image">
            <label>
                Upload Image:
                <br>
                <input type="file" name="i">
            </label>
        </div>
            <br>
            <div class="upload_btn">
                <label>
                    <input type="submit" value="update">
                </label>

            </div>


    </form>
    <%
        String email=u.getEmail();
        String image=request.getParameter("i");

        try{
            Connection con=connection.getconnection();
            File f=new File(image);
            String img=f.getAbsolutePath();
            FileInputStream fi=new FileInputStream(img);
            PreparedStatement dpt=con.prepareStatement("delete from student_images where email=?");
            dpt.setString(1,email);
            dpt.executeUpdate();
            PreparedStatement pt=con.prepareStatement("insert into student_images (email,img) values (?,?)");
            pt.setString(1,email);
            pt.setBinaryStream(2,fi);
            pt.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    %>
    <h1>


    </h1>


</div>








</body>
</html>
