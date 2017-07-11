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
 */
public class challenge11no6 extends HttpServlet {

    ArrayList<Integer> id = new ArrayList<Integer>();

    ArrayList<String> name = new ArrayList<String>();

    ArrayList<Integer> birth = new ArrayList<Integer>();

    ArrayList<String> address = new ArrayList<String>();

    Integer info(Integer id, Integer birth) {

        return id;
    }

    String info(String name, String address, PrintWriter pw) {

        return name;
    }

    Integer info(Integer birth) {
        return birth;
    }

    String info(String address) {
        return address;
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs 引数が１つのメソッドを作成してください。
     * メソッドの中の処理は、３人分のプロフィール（項目は戻り値2と同様）を作成し、引数として渡された値と同じIDを持つ人物のプロフィールを返却する様にしてください。
     * それ以降は課題「戻り値2」と同じ処理にしてください。
     *
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String key = "1";

            id.add(135);
            name.add("辻　竜也");
            birth.add(14289);
            address.add("東京都東成区");

            id.add(523);
            name.add("岡室　隆");
            birth.add(12230912);
            address.add("東京都港区");

            id.add(532);
            name.add("近藤　正樹");
            birth.add(19901122);
            address.add("大阪府堺市南区");

            int index = id.indexOf(532);

            if (id.contains(135)) {

                out.println(name.get(index));
                out.println(birth.get(index));
                out.println(address.get(index));
                out.print("<br>");
            }

            int index2 = id.indexOf(135);

            if (id.contains(135)) {

                out.println(name.get(index2));
                out.println(birth.get(index2));
                out.println(address.get(index2));
                out.print("<br>");
            }

            int index3 = id.indexOf(523);

            if (id.contains(135)) {

                out.println(name.get(index3));
                out.println(birth.get(index3));
                out.println(address.get(index3));
                out.print("<br>");
            }

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet challenge11no6</title>");
            out.println("</head>");
            out.println("<body>");

//            out.print(id.contains(13));
//
//            out.print(id.indexOf(532));
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
