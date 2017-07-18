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
import org.camp.servlet.Human;
/**
 *
 * @author tsujitatsuya
 */
public class challenge13no3 extends HttpServlet {

    
    
    
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
            
            Dealer dealer = new Dealer ();
            User user = new User ();
            
            dealer.setCard(dealer.deal());
            user.setCard(dealer.deal());
            
            
            out.print("dealerの手札"+dealer.myCards+"<br>");
            out.print("プレイヤーの手札"+user.myCards+"<br>");
            
            dealer.open();
            user.open();
            
            out.print("dealerの合計"+dealer.open()+"<br>");
            out.print("プレイヤーの合計"+user.open()+"<br>");
            
            if(dealer.checkSum()){
                dealer.setCard(dealer.hit());
                out.print("dealer:SETしました。<br>");
            }else{
                out.print("SETしませんでした。<br>");
            }
            
            if(user.checkSum()){
                user.setCard(dealer.hit());
                out.print("user:SETしました。<br>");
            }else{
                out.print("SETしませんでした。<br>");
            }
            
            out.print("dealerの合計"+dealer.open()+"<br>");
            out.print("userの合計"+user.open()+"<br>");
            
            
            if(dealer.open() == user.open() || (dealer.open() >= 22 && user.open() >=22)){
                out.print("DRAW");
            }else if(dealer.open() >= 22){
                out.print("BUST");
            }else if(user.open() >= 22){
                out.print("BUST");   
            }else if(dealer.open() == 21){
                out.print("dealer:blackjack");
            }else if(user.open() == 21){
                out.print("user:blackjack");
            }else if(dealer.open() > user.open()){
                        out.print("dealer:win");
                        }else{
                out.print("user:win");
            }
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet challenge13no3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet challenge13no3 at " + request.getContextPath() + "</h1>");
            
            
            
            
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
