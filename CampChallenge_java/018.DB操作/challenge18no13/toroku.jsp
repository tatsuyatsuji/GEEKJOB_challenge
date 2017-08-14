<%-- 
    Document   : toroku
    Created on : 2017/08/14, 13:44:21
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
        <form action="./shohinjoho" method="post">
            
            <p>商品名:<input type="text" name="name"></p>
            
            <p>商品詳細:<input type="text" name="joho"></p>
            
            <input type="submit" name="submit" value="送信">
            
        </form>
    </body>
</html>
