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
import javax.servlet.http.HttpSession;
import java.sql.Date;
/**
 *
 * @author tsujitatsuya
 */
public class challenge18no9 extends HttpServlet {

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
        
        
         Connection db_con = null ;
        PreparedStatement db_st = null;
        int db_data;
        String url = "jdbc:mysql://localhost:3306/Challenge_db";
            String user = "tsujitatsuya";
            String password = "40199";
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            request.setCharacterEncoding("UTF-8");
            
            String i = request.getParameter("id");
            int id = Integer.parseInt(i);
            
            String name3 = request.getParameter("name2");
            
            String tel1 = request.getParameter("tel");
        
       
            String age1 = request.getParameter("age");
            int age2 = Integer.parseInt(age1);
            
           
            String birthday1 = request.getParameter("btd");
         
            
           String state = "insert into profiles values(?,?,?,?,?)";
            
//            String name5 = "近藤　マサル";
//            
//            String tel3 = "111111111111";
//            
//            int age3 = 22;
//
//            String btd = "1111-11-11";
          
            try
            {     
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection(url,user,password);
               
               
                db_st = db_con.prepareStatement(state);
                 db_st.setInt(1, id);
                db_st.setString(2, name3);
                db_st.setString(3, tel1);
                db_st.setInt(4, age2);
                db_st.setString(5, birthday1);
               
                
//                insert into profiles (name,tel,age,birthday) VALUES ('近藤　正樹',90935825034,63,1965/12/11);
//                db_st.setString(1,'%'+name3+'%');
//                db_st.setString(2,'%'+tel1+'%');
//                db_st.setInt(3,'%'+age2+'%');
//                db_st.setString(4,'%'+birthday1+'%');
//                db_st.setString(1,'%'+name5+'%');
//                db_st.setString(2,'%'+tel3+'%');
//                db_st.setInt(3,'%'+age3+'%');
//                db_st.setString(4,'%'+btd+'%');
                db_data = db_st.executeUpdate();
       
              
               out.print(db_data+"追加されました。");
            
            db_st.close();
            db_con.close();
        }catch(SQLException e_sql){
            out.println(""+e_sql.toString());
        }catch (Exception e){
            out.println(""+e.toString());
        }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet challenge18no9</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet challenge18no9 at " + request.getContextPath() + "</h1>");
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
