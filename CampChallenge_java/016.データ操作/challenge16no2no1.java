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
 * @author tsujitatsuya クエリストリングを利用して、以下の処理を実現してください。
 *
 * ○想定されるクエリストリング http://localhost:8080/対象ファイル.jsp?total=総額&count=個数&type=商品種別
 * 例）http://localhost:8080/対象ファイル.jsp?total=1500&count=10&type=2
 * ⇒総額1500円、10個、商品種別は2
 *
 * 1. 受け取った商品種別を以下の対応で日本語表示してください。 雑貨、2：生鮮食品、3:その他 例)typeが2だったら、「生鮮食品」
 *
 * 2. 受け取った総額と個数から、１個当たりの値段を算出し、表示してください。
 *
 * 3. 総額に応じたポイントが付きます。ポイントを計算し、表示してください。 3000円以上で、4% 5000円以上で、5%
 */
public class challenge16no2no1 extends HttpServlet {

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
            
            request.setCharacterEncoding("UTF-8");
            
            request.getParameter("kosu");
            request.getParameter("sougaku");
            
            String syubetu = request.getParameter("syubetu");
            
            String sougaku = request.getParameter("sougaku");
            String kosu = request.getParameter("kosu");
            
            int s = Integer.parseInt(sougaku);
            int k = Integer.parseInt(kosu);
            
            int hitotuatari = s / k;
            
          

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet challenge16no2no1</title>");            
            out.println("</head>");
            out.println("<body>");
            
            if ("1".equals(syubetu)) {
                out.print("<h1>" + "雑貨" + "</h1>" + "</br>");
            } else if ("2".equals(syubetu)) {
                out.print("<h1>" + "生鮮食品" + "</h1>" + "</br>");
            } else {
                out.print("<h1>" + "その他" + "</h1>" + "</br>");
            }
            
           out.print("一つあたりの値段"+hitotuatari+"円");
           
           
             if(s >= 5000 ){
                out.print("ポイント5%付与");
                
            }else if(s >= 3000){
                out.print("ポイント4%付与");
            }
           
            
            
            
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

}
