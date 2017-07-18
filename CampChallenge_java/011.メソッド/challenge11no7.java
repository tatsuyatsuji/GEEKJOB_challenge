/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
/**
 *
 * @author tsujitatsuya
 */
public class challenge11no7 extends HttpServlet {

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

    
    String [] profiles(int i){
        String [][] profiles ={
            {"id1","name1","birth1","address1"},
            {"id2","name2","birth2",null},
            {"id3","name3","birth3","address3"}
        };
        return profiles[i];
    }
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * 課題「引数、戻り値1」の3人分のプロフィールのうち、1人だけ住所の値をnullで定義し、ループ処理で全員分のプロフィールをid以外表示する処理を作成してください。
この際、nullになっているデータはcontinueで飛ばしながら表示してください。
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            for(int i=0; i< 3; i++){
                String[] prof = profiles(i);
                for(int j =1;j<prof.length; j++){
                    if(prof[j] ==null){
                        continue;
                    }
                    out.print(prof[j]+"<br>");
                }
            }
            
            
            
            
            
            
            
            
            
            
            
            id.add(135);
            name.add("辻　竜也");
            birth.add(14289);
            address.add("東京都東成区");

            id.add(523);
            name.add("岡室　隆");
            birth.add(12230912);
            address.add("東京都港区");

            id.add(532);
            name.add("左近　総一郎");
            birth.add(19901122);
            address.add(null);

            id.add(636);
            name.add("林　誠");
            birth.add(19901122);
            address.add("東京都東成区");

            id.add(257);
            name.add("内藤　仁");
            birth.add(19901122);
            address.add("大阪府堺市南区");

            id.add(5847);
            name.add("近藤　正樹");
            birth.add(19901122);
            address.add(null);

            int index = id.indexOf(135);

            for (int i = 0; i < 30; i++) {
            
               
                    out.println(name.get(index));   out.print("<br>");
                    out.println(birth.get(index));   out.print("<br>");
                    out.println(address.get(index));
                    out.print("<br>");

                    address.removeAll(Collections.singleton(null));
                    
                    index++;

                

            }

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet challenge11no7</title>");
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
