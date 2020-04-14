<%--
  Created by IntelliJ IDEA.
  User: kirankakkera
  Date: 4/5/20
  Time: 3:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        response.setHeader("cache-control","no-cache,no-store,must-revalidate");
        response.setHeader("programa","no-cache");
        response.setHeader("Expires","0");
    %>
    <title>logout</title>
    <%
        HttpSession s=request.getSession();
        s.removeAttribute("currentuser");
        request.setAttribute("logout","Successfully Logged out");
       request.getRequestDispatcher("/login.jsp").forward(request,response);
    %>
</head>
<body>

</body>
</html>
