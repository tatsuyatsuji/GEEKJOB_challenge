<%-- 
    Document   : challenge8-4
    Created on : 2017/07/03, 14:29:47
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
            int key = 1000;
            int count = 0;
            while(key <= 100 == false){
                key = key / 2;
                count++;
                
                out.print(key);
                out.print("<br>");
            }
            

            %>
    </body>
</html>
