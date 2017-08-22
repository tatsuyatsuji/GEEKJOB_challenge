<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%@page import="jums.UserDataBeans" %>
<%
    HttpSession hs = request.getSession();
//    ユーザーデータビーンズで登録したセッッショんに入ってるキーudbを呼び出す？
    UserDataBeans udb = (UserDataBeans) hs.getAttribute("udb");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
    </head>
    <body>
       
        <% if (!(udb.getName().equals("")) && !(udb.getYear().equals("")) && !(udb.getMonth().equals("")) && !(udb.getDay().equals(""))
                    && !(udb.getType().equals("")) && !(udb.getTell().equals("")) && !(udb.getComment().equals(""))) {%>
        <h1>登録確認</h1>
        名前:<%= udb.getName()%><br>
        生年月日:<%= udb.getYear() + "年" + udb.getMonth() + "月" + udb.getDay() + "日"%><br>
        種別:<%= udb.getType()%><br>
        電話番号:<%= udb.getTell()%><br>
        自己紹介:<%= udb.getComment()%><br>
        上記の内容で登録します。よろしいですか？
        <form action="insertresult" method="POST">
            <input type="hidden" name="ac" value="<%= hs.getAttribute("ac")%>">
            <input type="submit" name="yes" value="はい">
        </form>
        <% } else { %>
        <h1>入力が不完全です</h1>
        <%
    //        フォーム不完全表示

                if (udb.getName().equals("")) {
                    out.println("'名前' の入力が不完全です<br>");
                }
//                『||』は少なくとも１つがtrueの場合にtrueという意味
                if (udb.getYear().equals("") || udb.getMonth().equals("") || udb.getDay().equals("")){
                    out.println("'生年月日' の入力が不完全です<br>");
                }
                if (udb.getTell().equals("")){
                    out.println("'電話番号' の入力が不完全です<br>");
                }
                if (udb.getComment().equals("")){
                    out.println("'自己紹介' の入力が不完全です<br>");
                }
                

            }%>
        <form action="insert" method="POST">
            <input type="submit" name="no" value="登録画面に戻る">
        </form>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
