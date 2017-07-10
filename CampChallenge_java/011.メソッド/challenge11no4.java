/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tsujitatsuya 1. ３つの引数を持ち、渡された数値で掛け算をするメソッドを作成します。
 * メソッドは、１つ目の引数と２つ目の引数を掛け算し、３つ目の引数がtrueの場合は結果を２乗させてください。
 * また、２つ目の引数は5、３つ目の引数はfalseをデフォルト値として設定してください。 2. 作成したメソッドを呼び出し、結果を表示してください。
 * 
 * 課題「ユーザー定義メソッドの作成」で定義したメソッドを拡張します。
メソッドへ戻り値を追加し、　true(boolean)　を返却するように修正してください。
また、メソッドの呼び出し側で戻り値を評価し、trueなら「この処理は正しく実行できました」、そうでないなら「正しく実行できませんでした」と表示してください。
 *
 */
public class challenge11no3 extends HttpServlet {
    
//    int x = 1;
//    
//    int y = 1;
//    
//    boolean a = true;
//    
//    boolean b = false;
    
//    void suji(int x, int y, boolean a, PrintWriter pw) {
//        
//        if (a) {
//            
//            pw.print(x + "かける" + y + "の２乗は" + (x * y) * (x * y));
//            pw.print("true");
//        } else {
//            pw.print(x + "かける" + y + "は" + (x * y));
//            pw.print("false");
//        }
//        pw.print("<br>");
//        
//    }
//    
//    void suji(PrintWriter pw) {
//        
//        suji(1, 5, b, pw);
//        
//    }
//    
//    boolean check(boolean a) {
//        boolean result;
//        result = (a == true);
//        return result;
//    }
    
    boolean myprofile(PrintWriter pw){
        boolean a = false;
        
        pw.print("私は辻と申します");
        pw.print("音楽はEDMをよく聞きます");
        pw.print("趣味はDTM,ゲームなどです<br>");      
        return a;
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet challenge11no3</title>");            
            out.println("</head>");
            out.println("<body>");
            
            if(myprofile(out)){
                out.print("この処理は正しく実行されました");
            } else{
                out.print("この処理");
            }           
            
            
            
//            if (check(a)) {                
//                
//                out.print("この処理は正しく実行できました");
//            } else {
//                out.print("正しく実行できませんでした");
//            }                 
//            suji(out);
//            
//            suji(1, 7, b, out);
//            
//            suji(4, 1, b, out);
//            suji(38, 37, b, out);
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void String(String 正しく実行されました) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    
}
