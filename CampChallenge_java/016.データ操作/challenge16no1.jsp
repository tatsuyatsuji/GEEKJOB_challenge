<%-- 
    Document   : challenge16no1
    Created on : 2017/07/19, 17:40:06
    Author     : tsujitatsuya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>コントロールサンプル</title>
    </head>
    <body>
       
           <h1><Form action="./challenge16no1" method="post"></h1>
               <!-- formタグで括られたにゅうリュク項目はこれら-->
               
               <center><h3>name:<input type="text" name="txtName"></h3></br></center>
               
               <center>男<input type="radio" name="rdoSample"></center>
               
                <center>女<input type="radio" name="rdoSample"></br></center>
                   
              <center>趣味：<textarea  cols="10" rows="3" style="width:500px;height:200px;"name="mulText"></textarea></center>
               
               <center><input type="submit" name="btnSubmit"></center>
               
         
        
    </body>
</html>
