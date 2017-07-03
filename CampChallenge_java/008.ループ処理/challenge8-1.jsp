<%-- 
    Document   : challenge8-1
    Created on : 2017/07/03, 10:20:13
    Author     : tsujitatsuya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          long total = 1;
          
          for (long i=0;i<20;i++){
              total = total * 8;
              
              out.print (total);
              
              out.print ("<br>");
          }
              
            %>
    </body>
</html>
