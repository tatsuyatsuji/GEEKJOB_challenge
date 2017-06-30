<%-- 
    Document   : callenge3-1
    Created on : 2017/06/30, 11:33:27
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
            final int BASE = 60;
            int num1 = 1;
            int num2 = 2;
            int num3 = 3;
            int num4 = 4;
            String br = "<br>";
            
            
                out.print("<br>");
             out.print(BASE + num1);
                out.print("<br>");
             out.print(BASE - num2);
                out.print("<br>");
             out.print(BASE * num3);
                out.print("<br>");
             out.print(BASE / num4);
                out.print("<br>");
             out.print(num1 % num4);
            %>
    </body>
</html>
