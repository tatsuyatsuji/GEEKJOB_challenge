<%-- 
    Document   : challenge8-2
    Created on : 2017/07/03, 13:20:15
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
            String a = "";
            
            for(int i =0;i<=30;i++){
                a = a + "A";
            }
            out.print (a);
            %>
       
    </body>
</html>
