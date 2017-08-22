<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%@page import="jums.UserDataBeans" %>
<%
    HttpSession hs = request.getSession();
    UserDataBeans udb = (UserDataBeans)hs.getAttribute("udb");
//    nullチェック
    boolean notNull;
    if(udb !=null){
        notNull = true;
    }else{
        notNull = false;
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録画面</title>
    </head>
    <body>
    <form action="insertconfirm" method="POST">
        名前:
        <input type="text" name="name" palceholder="山田　太郎" value="<% if(notNull){out.print(udb.getName());} %>">
        <br><br>

        生年月日:　
        <select name="year">
            <option value=""><% if(notNull){out.print(udb.getYear());} %></option>
            <%
            for(int i=1950; i<=2010; i++){ %>
            <option value="<%=i%>"> <%=i%> </option>
            <% } %>
        </select>年
        <select name="month">
            <option value=""><% if(notNull){out.print(udb.getMonth());} %></option>
            <%
            for(int i = 1; i<=12; i++){ %>
            <option value="<%=i%>"><%=i%></option>
            <% } %>
        </select>月
        <select name="day">
            <option value=""><% if(notNull){out.print(udb.getDay());} %></option>
            <%
            for(int i = 1; i<=31; i++){ %>
            <option value="<%=i%>"><%=i%></option>
            <% } %>
        </select>日
        <br><br>

        種別:
        <br>
        <input type="radio" name="type" value="1" <% if(udb.getTypeNum() == 1 || udb.getTypeNum() == 0){out.print("checked");}%> >>エンジニア<br>
        <input type="radio" name="type" value="2"<% if(udb.getTypeNum() == 2){out.print("checked");} %> >営業<br>
        <input type="radio" name="type" value="3"<% if(udb.getTypeNum() == 3){out.print("checked");} %>>その他<br>
        <br>

        電話番号:
        <input type="text" name="tell" placeholder="000-0000-0000" value="<% if(notNull){out.print(udb.getTell());} %>">
        <br><br>

        自己紹介文
        <br>
        <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard" placeholder="こんにちは"><% if(notNull){out.print(udb.getComment());} %></textarea><br><br>
        
<!--        見えない情報、name,acを作りバリューにセッションスコープにあるキーacを呼び出す
--><input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>"><!--
        サーブレットでランダムに生成した数値をヴァリューに入れている
        そうすることで、フォームでinsertconfirmに飛んだ時に情報が残り
        ,if文を使いもし情報が正しければアクセス可能、情報が違うまたは
        情報が入っていなければ不正アクセスといった直リンク防止処理を施すことができる？-->
        
        <input type="submit" name="btnSubmit" value="確認画面へ">
    </form>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
