<%-- 
    Document   : callenge7-1
    Created on : 2017/06/30, 16:49:58
    Author     : tsujitatsuya
--%>
<%@ page import = "java.util.HashMap" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HashMap<String,String> data1 = new HashMap<String,String> ();
            data1.put("1","AAA");
            data1.put("hello","world");
            data1.put("soeda","33");
            data1.put("20","20");

out.print(data1.size());
out.print(data1.get("1"));

            %>
    </body>
</html>
