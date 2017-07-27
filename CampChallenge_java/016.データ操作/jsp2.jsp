<%-- 
    Document   : jsp2
    Created on : 2017/07/25, 14:10:35
    Author     : tsujitatsuya
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.net.URLDecoder"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
Cookie cookies[] =request.getCookies();

Cookie accesstimeCookie = null;

//ArrayList<String> array = new ArrayList<String>();

if(cookies != null){
    for(int i = 0; i < cookies.length; i++){
    if(cookies[i].getName().equals("accesstime")){
        
        accesstimeCookie = cookies[i];
//        array.add(accesstimeCookie.getValue());
    }
    }
    
    }

//String rireki = array.toString();

String accesstime;

 if(accesstimeCookie == null){
     accesstime ="kirokunasi";
     
 }else{
     accesstime = URLDecoder.decode(accesstimeCookie.getValue());
     
//     URLDecoder.decode(rireki);


}








%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <a href="jsp1.jsp">クッキーを設定</a>
        <a href="jsp3.jsp"> クッキーを破棄</a>
        
        <b><%= accesstime %></b>
        
       
        
    </body>
</html>
