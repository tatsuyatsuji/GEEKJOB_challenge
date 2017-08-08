/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tsujitatsuya
 */
public class challenge18no7 extends HttpServlet {

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
        
         Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        String url = "jdbc:mysql://localhost:3306/Challenge_db";
            String user = "tsujitatsuya";
            String password = "40199";
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
                try
            {
                
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection(url,user,password);
                
               
                db_st = db_con.prepareStatement("update profiles set name = '松岡修造', age = 48, birthday = '1967-11-06' where profilesID = ?");
                db_st.setInt(1,1);
                db_st.executeUpdate();
                
                while(db_data.next()){
                    int pfID = db_data.getInt("profilesID");
                    String name = db_data.getString("name");
                    String tel = db_data.getString("tel");
                    int age = db_data.getInt("age");
                    String bdy = db_data.getString("birthday");
                    
                    out.print(pfID+"||"+name+"||"+tel+"||"+age+"||"+bdy+"||"+"<br>");
                }
            
            db_data.close();
            db_st.close();
            db_con.close();
        }catch(SQLException e_sql){
            out.println(""+e_sql.toString());
        }catch (Exception e){
        }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet challenge18no7</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet challenge18no7 at " + request.getContextPath() + "</h1>");
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
