<%--
  Created by IntelliJ IDEA.
  User: JF194405
  Date: 03.08.2017
  Time: 09:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="pl.kosa.model.LoginBean" %>
<%
    LoginBean bean = (LoginBean) request.getAttribute("bean");
    out.print("Welcome, " + bean.getName());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
