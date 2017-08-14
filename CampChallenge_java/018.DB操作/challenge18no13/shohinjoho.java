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
import java.sql.*;
/**
 *
 * @author tsujitatsuya
 */
public class shohinjoho extends HttpServlet {

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
        
        Connection db_con = null;
        PreparedStatement db_st = null; 
        int db_data;
        
        String url="jdbc:mysql://localhost:3306/challenge18_db";
        String user="tsujitatsuya";
        String password ="40199";
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            request.setCharacterEncoding("UTF-8");
            
            String n =request.getParameter("name");
            
            String j =request.getParameter("joho");
            
            String state ="insert into shohin values(0,?,?)";
            
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection(url,user,password);
                
                db_st = db_con.prepareStatement(state);
                db_st.setString(1, n);
                db_st.setString(2, j);
                
                db_data = db_st.executeUpdate();
                
                out.println("データ登録完了");
                out.print("<a href=./loginf.jsp>ログイン画面へ</a>");
                
                db_st.close();
                db_con.close();
            }catch(SQLException e_sql){
                out.println("エラー"+e_sql.toString());
                out.print("<a href=./loginf.jsp>ログイン画面へ</a>");
            }catch(Exception e){
                out.println("エラー"+e.toString());
                 out.print("<a href=./loginf.jsp>ログイン画面へ</a>");
            }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet shohinjoho</title>");            
            out.println("</head>");
            out.println("<body>");
            
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
