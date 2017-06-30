<%-- 
    Document   : callenge5-1
    Created on : 2017/06/30, 13:37:25
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
            int x = 2;
            
            if(x == 1){
                out.print("１です！");
            }else if(x == 2){
                out.print("プログラミングキャンプ！");
            }else{
                out.print("その他です！");
            }
            %>
    </body>
</html>
