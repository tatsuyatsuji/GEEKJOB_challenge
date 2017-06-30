<%-- 
    Document   : challenge5-3
    Created on : 2017/06/30, 14:17:40
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
            String moji ="A";
            
            switch(moji){
                case "A":
                    out.print("英語");
                    break;
                    
                case "あ":
                    out.print("日本語");
                    break;
                default:
                    out.print("");
                    break;
                    
            }
               
            %>
    </body>
</html>
