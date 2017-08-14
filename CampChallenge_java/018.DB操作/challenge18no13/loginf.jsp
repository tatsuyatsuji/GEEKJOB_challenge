<%-- 
    Document   : loginf
    Created on : 2017/08/13, 16:03:27
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
        <h1>ログインフォーム</h1>
        
        <form action="./log1" method="post">
            
            <p>名前:<input type="text" name="name"></p>
            
            <p>パスワード:<input type="text" name="pass"></p>
            
            <input type="submit" name="submit" value="送信">
            
        </form>
        
        <a href="./newlog.jsp">アカウント新規作成</a>
    </body>
</html>
