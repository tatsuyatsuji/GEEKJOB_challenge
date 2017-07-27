/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
     * @throws IOException if an I/O error occurs Date now = new Date();
     *
     * String value = URLEncoder.encode(now.toString());
     *
     * Cookie cookie = new Cookie ("accesstime",value);
     *
     * cookie.setMaxAge(7*20*60*60);
     *
     * response.addCookie(cookie);
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        セッションに登録した日付

//        String value = URLEncoder.encode(now.toString());
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        String str2 = sdf1.format(new Date());
        HttpSession hs = request.getSession();

        hs.setAttribute("accestime", str2);

        String lunch = (String) hs.getAttribute("accestime");

//        Cookie cookies[] = request.getCookies();
//
//        Cookie accesstimeCookie = null;

//        if (cookies != null) {
//            for (int i = 0; i < cookies.length; i++) {
//                if (cookies[i].getName().equals("accesstime")) {
//
//                    accesstimeCookie = cookies[i];
//                }
//            }
//
//        }
//
//        String accesstime;
//
//        if (accesstimeCookie == null) {
//            accesstime = "kirokunasi";
//
//        } else {
//            accesstime = URLDecoder.decode(accesstimeCookie.getValue());
//
//        }

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servlet1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servlet1 at " + request.getContextPath() + "</h1>");

            out.println("<a href=jsp1.jsp>クッキーを設定</a>");
            out.print("<a href=jsp3.jsp> クッキーを破棄</a>");
            out.print(lunch);
//            out.print(accesstime);

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
