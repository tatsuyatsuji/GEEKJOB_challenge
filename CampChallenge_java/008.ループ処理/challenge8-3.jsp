<%-- 
    Document   : challenge8-3
    Created on : 2017/07/03, 13:46:36
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
            long kazu = 0;
            for(long i =0; i<=100; i++){
                kazu += i;
            }
           
            out.print(kazu);

            %>
    </body>
</html>
