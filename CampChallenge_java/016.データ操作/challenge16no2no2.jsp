<%-- 
    Document   : challenge16no2no2
    Created on : 2017/07/21, 15:26:25
    Author     : tsujitatsuya
クエリストリングを利用して、以下の処理を実現してください。

1. 簡易素因数分解のロジックを作成します。
クエリストリングから渡された数値を1ケタの素数で可能な限り分解し、
元の値と素因数分解の結果を表示するようにしてください。
2ケタ以上の素数が含まれた数値の場合は、
「元の値　1ケタの素因数　余った値」と表記してください。

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <form method ="get" action="./challenge16no2no2">
            
            数１<input type="text" placeholder="数値を入力してください。" name="kazu1" pattern="\d*" oncopy="return false" 
                   onpaste="return false" oninput="check_numtype(this)" onblur="check_code(this)" style="ime-mode:disabled">
        
        <input type="submit" name="btnSubmit" >
        
    </body>
</html>
