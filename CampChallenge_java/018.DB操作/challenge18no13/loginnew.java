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
import java.sql.DriverManager;
/**
 *
 * @author tsujitatsuya
 */
public class loginnew extends HttpServlet {

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
        
//        初期化
                Connection db_con = null;
                PreparedStatement db_st = null;
                int db_data;
        
//        db情報
                
                String url = "jdbc:mysql://localhost:3306/challenge18_db";
        String user = "tsujitatsuya";
        String password = "40199";
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            form情報
            request.setCharacterEncoding("UTF-8");
            
            String i =request.getParameter("id");
            int id = Integer.parseInt(i);
            
            String name = request.getParameter("newname");
            
            String pass = request.getParameter("newpass");
            
//            アカウント情報をdbに登録

            String state = "insert into profiles values(?,?,?)";
            
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection(url,user,password);
                
                db_st = db_con.prepareStatement(state);
                db_st.setInt(1,id);
                db_st.setString(2,name);
                db_st.setString(3,pass);
                
                db_data = db_st.executeUpdate();
                
                out.print("アカウント新規作成いたしました。");
                out.print("<a href=./loginf.jsp>ログインフォームへ</a>");
                db_st.close();
                db_con.close();
            }catch(SQLException e_sql){
                out.println("エラー"+e_sql.toString());
                 out.print("<a href=./loginf.jsp>ログインフォームへ</a>");
            }catch(Exception e){
                out.println("エラー"+e.toString());
                 out.print("<a href=./loginf.jsp>ログインフォームへ</a>");
            }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet loginnew</title>");            
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
