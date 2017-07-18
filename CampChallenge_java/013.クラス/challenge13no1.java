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

/**
 *
 * @author tsujitatsuya
 */
//1. パブリックな２つの変数と、２つの変数に値を設定するパブリックなメソッドと、２つの変数の中身をprintするパブリックなメソッド
//class dorirusuna{
//    
//        
//public String doriru = "dgjle";
//public String suna = "gsjl;k;";
//
//public void awaseru(String d,String s){
//    
//    this.doriru =d;
//    this.suna =s;
//    
//}
//
//
//public void hyouji(PrintWriter pw){
//    
//    pw.print(doriru);
//    pw.print(suna);
//}
//}
class Human {

    //パブリックな2つの変数
    public String name;
    public int age;

    //2つの変数に値を設定するパブリックなメソッド
    public void setHuman(String n, int a) {
        this.name = n;
        this.age = a;
    }

    //2つの変数の中身をプリントするパブリックなメソッド
    public void print(PrintWriter pw) {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class challenge13no1 extends HttpServlet {

    //Humanクラスのインスタンス生成
    Human hito = new Human();
    //hitoインスタンスのsetHumanメソッドを利用

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //Humanクラスのインスタンス生成
        Human hito = new Human();

        hito.setHuman("山下航", 26);
        //hitoインスタンスのprintメソッドを利用 

        //hitoインスタンスのsetHumanメソッドを利用
        hito.setHuman("山下航", 26);
        //hitoインスタンスのprintメソッドを利用

        Teacher soeda = new Teacher();

        soeda.setHuman("近藤　泰", 86);

        Teacher2 soeda2 = new Teacher2();

        try (PrintWriter out = response.getWriter()) {

//dorirusuna sengen = new dorirusuna();
//
//
//sengen.doriru ="fe";
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet challenge13no1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet challenge13no1 at " + request.getContextPath() + "</h1>");

            out.print(hito.name);
            out.print(hito.age);

            out.print(soeda.name);
            out.print(soeda.age);

            soeda.kougi(out);
            soeda.clear(out);
            soeda.kougi(out);
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
