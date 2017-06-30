<%-- 
    Document   : challenge6-2
    Created on : 2017/06/30, 15:46:36
    Author     : tsujitatsuya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        ArrayList<String> date1 = new ArrayList<String>();
        date1.add("10");
        date1.add("100");
        date1.add("soeda");
        date1.add("hayashi");
        date1.add("-20");
        date1.add("118");
        date1.add("END");
        
         
         
         date1.set(2,"33");
        
        
out.print(date1.get(2));


        
                %>
    </body>
</html>
