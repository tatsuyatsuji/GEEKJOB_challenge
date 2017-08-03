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
public class challenge18no3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs JDBCを利用して、以下の課題を実現してください。
     * 前回の課題「テーブルの作成とinsert」で作成したテーブルからSELECT*により全件取得し、画面に取得した全情報を表示してください。
     *
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection db_con = null;
        PreparedStatement db_st = null;
        PreparedStatement db_st2 = null;
        ResultSet db_data = null;
        ResultSet db_data2 = null;
        
        String url = "jdbc:mysql://localhost:3306/Challenge_db";
        String user = "tsujitatsuya";
        String password = "40199";
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection(url, user, password);
                
                db_st = db_con.prepareStatement("select * from profiles");
                db_data = db_st.executeQuery();
                
                db_st2 = db_con.prepareStatement("select * from user");
                db_data2 = db_st2.executeQuery();
//                while(db_data.next()){
//                     int pfID = db_data.getInt("profilesID");
//                    String name = db_data.getString("name");
//                    String tel = db_data.getString("tel");
//                    int age = db_data.getInt("age");
//                    String bdy = db_data.getString("birthday");
//                    
//                    out.print(pfID+"||"+name+"||"+tel+"||"+age+"||"+bdy+"||"+"<br>");
//                }
                
                while(db_data2.next()){
                    int user2 = db_data2.getInt("userID");
                    String name = db_data2.getString("name");
                    String tel = db_data2.getString("tel");
                    int age = db_data2.getInt("age");
                    String bdy = db_data2.getString("birthday");
                    int departmentId = db_data2.getInt("departmentID");
                    int stationId = db_data2.getInt("stationID");
                    
                    out.print(user2+"||"+name+"||"+tel+"||"+age+"||"+bdy+"||"+departmentId+"||"+stationId+"<br>");
                    
                }
                db_data.close();
                db_data2.close();
                db_st.close();
                db_st2.close();
                db_con.close();
                
                
                
            } catch (SQLException e_sql) {
                out.print("dame" + e_sql.toString());
            } catch (Exception e) {
            }

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet challenge18no3</title>");
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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
