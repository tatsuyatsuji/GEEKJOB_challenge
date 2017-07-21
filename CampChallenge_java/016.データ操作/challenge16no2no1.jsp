<%-- 
    Document   : challenge16no2no1
    Created on : 2017/07/21, 11:44:07
    Author     : tsujitatsuya
クエリストリングを利用して、以下の処理を実現してください。

○想定されるクエリストリング
http://localhost:8080/対象ファイル.jsp?total=総額&count=個数&type=商品種別
例）http://localhost:8080/対象ファイル.jsp?total=1500&count=10&type=2
　⇒総額1500円、10個、商品種別は2

1. 受け取った商品種別を以下の対応で日本語表示してください。
　 雑貨、2：生鮮食品、3:その他
　 例)typeが2だったら、「生鮮食品」

2. 受け取った総額と個数から、１個当たりの値段を算出し、表示してください。

3. 総額に応じたポイントが付きます。ポイントを計算し、表示してください。
　 3000円以上で、4%
　 5000円以上で、5%

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <form method ="get" action="./challenge16no2no1" >
            総額<input type="text"placeholder="数値を入力してください。" name="sougaku" pattern="\d*"
                     oncopy="return false" onpaste="return false" oninput="check_numtype(this)" 
                     onblur="check_code(this)" style="ime-mode:disabled">
          
            個数<input type="number" name="kosu">
            商品種別<select name="syubetu">
                <option value ="1">雑貨</option>
                <option value ="2">生鮮食品</option>
                <option value="3">その他</option>
                    <input type="submit" name="btnSubmit">
                    
            </select>
        
        
    </body>
</html>
