<%-- 
    Document   : newlog
    Created on : 2017/08/13, 16:13:49
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
        <h1>アカウント新規作成</h1>
        
        <form action="./loginnew" method="post">
            
            <p><input type="hidden" name="id" value="0"></p>
            
            <p>名前:<input type="text" name="newname"></p>
            
            <p>パスワード:<input type="text" name="newpass"></p>
            
            <input type="submit" name="submit" value="送信">
            
        </form>
        
        
    </body>
</html>
