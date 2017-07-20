<%-- 
    Document   : challenge8-4
    Created on : 2017/07/03, 14:29:47
    Author     : tsujitatsuya
while文の条件式もif文の条件式と同じで、falseと比較する必要はありません。

while (key <= 100) {
のような書き方でも大丈夫です！
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
            while(key <= 100 ){
                key = key / 2;
                count++;
                
                out.print(key);
                out.print("<br>");
            }
            

            %>
    </body>
</html>
