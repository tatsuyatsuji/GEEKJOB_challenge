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
import java.util.ArrayList;

/**
 *
 * @author tsujitatsuya
 * 1. 戻り値として、人物のID、名前、生年月日、住所を配列にして返却するメソッドを作成してください。
2. 作成したメソッドを呼び出し、戻り値のID以外を表示してください。

 */
public class challenge11no5 extends HttpServlet {
    
    
    ArrayList<Integer> id = new ArrayList<Integer>();
    
    ArrayList<String> name = new ArrayList<String>(); 
    
    ArrayList<Integer> birth = new ArrayList<Integer>();
    
    ArrayList<String> address = new ArrayList<String>();
    
    
    Integer info(Integer id ,Integer birth){
        
        
        return id ;      
    }
    String info(String name, String address,PrintWriter pw){
        
        
        return name ;      
    }
    Integer info(Integer birth){
        return birth ;
    }
    String info(String address){
        return address ;
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
            out.println("<title>Servlet challenge11no5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet challenge11no5 at " + request.getContextPath() + "</h1>");
            
            id.add(13);
            
            name.add("ツジ");
            
            birth.add(19960114);
            
            address.add("東京都ひがしむらやま");
            
            
            
            
            out.print(name);
            out.print(birth);
            out.print(address);
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
