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




public class servlet1 extends HttpServlet {

    
    
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
             Connection db_con = null;
     PreparedStatement db_st = null;
     ResultSet db_data = null;
    String url = "jdbc:mysql://localhost:3306/Challenge_db";
            String user = "tsujitatsuya";
            String password = "40199";
            try
        {
         Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection(url,user,password);
            
            db_st = db_con.prepareStatement("select * from profiles where age = ?");
            db_st.setInt(1,33);
            
            db_data = db_st.executeQuery();
            while(db_data.next()){
                out.print("名前"+db_data.getString("name")+"<br>");
                out.print(db_data);
            }
            
            db_data.close();
            db_st.close();
            db_con.close();
            
        }catch (SQLException e_sql) {
            out.println("erorr"+e_sql.toString());
            
        }catch (Exception e){
            out.println("erorr"+e.toString());
        }finally{
                if(db_con != null){
                    try {
                        db_con.close();
                    }catch (Exception e_con){
                        System.out.println(e_con.getMessage());
                    }
                }
            }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servlet1 at " + request.getContextPath() + "</h1>");
            
            String msg = "";
    try {
      Class.forName("com.mysql.jdbc.Driver").newInstance();
      msg = "ドライバのロードに成功しました";
    }catch (ClassNotFoundException e){
      msg = "ドライバのロードに失敗しました";
    }catch (Exception e){
      msg = "ドライバのロードに失敗しました";
    }

    out.println("<p>");
    out.println(msg);
    out.println("</p>");

            
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
