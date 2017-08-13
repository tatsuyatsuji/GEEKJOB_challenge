<%-- 
    Document   : challenge18no8
    Created on : 2017/08/08, 11:19:22
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
        <h1>フォーム</h1>
        
        <form action="./challenge18no8" method="post" >
            <p>name検索:<input type="text" name="name"></p>
            <input type="submit" name="submit" value="送信">
            </form>
        
        挿入<form action="./challenge18no9" method="post" >
            
            <p>id:<input type="text" name="id"></p>
            
            <p>名前:<input type="text" name="name2"></p>
            
            <p>電話番号:<input type="text" name="tel"></p>
            
            <p>年齢:<input type="text" name="age"></p>
            
            <p>誕生日:<input type="text" name="btd"></p>
            
            <input type="submit" name="submit" value="送信">
            </form>
        
        削除<form action="./challenge18no10" method="post">
            
            <p>id:<input type="text" name="idd"></p>
            
            <input type="submit" name="submit" value="送信">
            
            </form>
        
        情報上書き<form action="./challenge18no11" method="post">
            
            <p>id:<input type="text" name="id5"></p>
            
            <p>名前:<input type="text" name="name5"></p>
            
            <p>電話番号:<input type="text" name="tel5"></p>
            
            <p>年齢:<input type="text" name="age5"></p>
            
            <p>誕生日:<input type="text" name="btd5"></p>
            
            <input type="submit" name="submit" value="送信">
            </form>
        
        複合検索<form action="./challenge18no12" method="post">
            
            
            <p>名前:<input type="text" name="name6"></p>
             
           <p>年齢:<input type="text" name="age6"></p>
            
            <p>誕生日:<input type="text" name="btd6"></p>
            
            <input type="submit" name="submit" value="送信">
            </form>
        
    </body>
</html>
