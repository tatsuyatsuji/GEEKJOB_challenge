package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;
import jums.JumsHelper;
import jums.UserDataBeans;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

    HttpSession hs = request.getSession();
    UserDataBeans udb = (UserDataBeans)hs.getAttribute("usb");
//    nullチェック
    boolean notNull;
    if(udb !=null){
        notNull = true;
    }else{
        notNull = false;
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JUMS登録画面</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <form action=\"insertconfirm\" method=\"POST\">\n");
      out.write("        名前:\n");
      out.write("        <input type=\"text\" name=\"name\" value=\"");
 if(notNull){out.print(udb.getName());} 
      out.write("\">\n");
      out.write("        <br><br>\n");
      out.write("\n");
      out.write("        生年月日:　\n");
      out.write("        <select name=\"year\">\n");
      out.write("            <option value=\"\">");
 if(notNull){out.print(udb.getYear());} 
      out.write("</option>\n");
      out.write("            ");

            for(int i=1950; i<=2010; i++){ 
      out.write("\n");
      out.write("            <option value=\"");
      out.print(i);
      out.write("\"> ");
      out.print(i);
      out.write(" </option>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </select>年\n");
      out.write("        <select name=\"month\">\n");
      out.write("            <option value=\"\">");
 if(notNull){out.print(udb.getMonth());} 
      out.write("</option>\n");
      out.write("            ");

            for(int i = 1; i<=12; i++){ 
      out.write("\n");
      out.write("            <option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </select>月\n");
      out.write("        <select name=\"day\">\n");
      out.write("            <option value=\"\">");
 if(notNull){out.print(udb.getDay());} 
      out.write("</option>\n");
      out.write("            ");

            for(int i = 1; i<=31; i++){ 
      out.write("\n");
      out.write("            <option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </select>日\n");
      out.write("        <br><br>\n");
      out.write("\n");
      out.write("        種別:\n");
      out.write("        <br>\n");
      out.write("        <input type=\"radio\" name=\"type\" value=\"1\" ");
 if(udb.getTypeNum() == 1 || udb.getTypeNum() == 0){out.print("checked");}
      out.write(" >>エンジニア<br>\n");
      out.write("        <input type=\"radio\" name=\"type\" value=\"2\"");
 if(udb.getTypeNum() == 2){out.print("checked");} 
      out.write(" >営業<br>\n");
      out.write("        <input type=\"radio\" name=\"type\" value=\"3\"");
 if(udb.getTypeNum() == 3){out.print("checked");} 
      out.write(">その他<br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        電話番号:\n");
      out.write("        <input type=\"text\" name=\"tell\" value=\"");
 if(notNull){out.print(udb.getTell());} 
      out.write("\">\n");
      out.write("        <br><br>\n");
      out.write("\n");
      out.write("        自己紹介文\n");
      out.write("        <br>\n");
      out.write("        <textarea name=\"comment\" rows=10 cols=50 style=\"resize:none\" wrap=\"hard\">");
 if(notNull){out.print(udb.getComment());} 
      out.write("</textarea><br><br>\n");
      out.write("        \n");
      out.write("<!--        見えない情報、name,acを作りバリューにセッションスコープにあるキーacを呼び出す\n");
      out.write("--><input type=\"hidden\" name=\"ac\"  value=\"");
      out.print( hs.getAttribute("ac"));
      out.write("\"><!--\n");
      out.write("        サーブレットでランダムに生成した数値をヴァリューに入れている\n");
      out.write("        そうすることで、フォームでinsertconfirmに飛んだ時に情報が残り\n");
      out.write("        ,if文を使いもし情報が正しければアクセス可能、情報が違うまたは\n");
      out.write("        情報が入っていなければ不正アクセスといった直リンク防止処理を施すことができる？-->\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" name=\"btnSubmit\" value=\"確認画面へ\">\n");
      out.write("    </form>\n");
      out.write("        <br>\n");
      out.write("        ");
      out.print(JumsHelper.getInstance().home());
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
