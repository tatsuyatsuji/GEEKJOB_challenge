<%-- 
    Document   : jsp1
    Created on : 2017/07/25, 14:03:40
    Author     : tsujitatsuya
--%>

<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
Date now = new Date();

String value = URLEncoder.encode(now.toString());

Cookie cookie = new Cookie ("accesstime",value);

cookie.setMaxAge(7*20*60*60);

response.addCookie(cookie);
















%>




<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
          <a href="jsp2.jsp">クッキーの中身jsp</a>
        <a href="servlet1">セッションの中身servlet</a>
    </body>
</html>
