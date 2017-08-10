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
public class challenge18no11 extends HttpServlet {

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
        
        String url ="jdbc:mysql://localhost:3306/Challenge_db";
        String user = "tsujitatsuya";
        String password = "40199";
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            request.setCharacterEncoding("UTF-8");
            
            String i = request.getParameter("id5");
            int id =Integer.parseInt(i);
            
            String name = request.getParameter("name5");
            
            String tel = request.getParameter("tel5");
            
            String a = request.getParameter("age5");
            int age5 =Integer.parseInt(a);
            
            String btd = request.getParameter("btd5");
            
            String state ="update profiles set name = ?, tel = ?, age = ?, birthday = ? where profilesID = ?";
            
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection(url,user,password);
                
                db_st = db_con.prepareStatement(state);
                
                
                db_st.setString(1, name);
                db_st.setString(2, tel);
                db_st.setInt(3, age5);
                db_st.setString(4, btd);
                db_st.setInt(5, id);
                
                db_data = db_st.executeUpdate();
                
                out.print(db_data+"上書きしました");
                
                db_st.close();
                db_con.close();
                
                
            }catch(SQLException e_sql){
                out.println(""+e_sql.toString());
            }catch(Exception e){
                out.println(""+e.toString());
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet challenge18no11</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet challenge18no11 at " + request.getContextPath() + "</h1>");
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
