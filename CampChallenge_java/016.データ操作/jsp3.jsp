<%-- 
    Document   : jsp3
    Created on : 2017/07/25, 14:26:35
    Author     : tsujitatsuya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%


Cookie cookie  = new Cookie("accesstime","");

cookie.setMaxAge(0);

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
        
        <a href="jsp2.jsp">クッキーの内容を確認</a>
        
        
        
    </body>
</html>
