/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.PrintWriter;

/**
 *
 * @author tsujitatsuya
 */
public class challenge13no2 {

}

class Teacher extends Human {

    public void kougi(PrintWriter pw) {
        String msg = "講師は" + this.name + "ですよろしくお願いいたします";

        pw.print(msg);
    }

    public void clear(PrintWriter pw) {

        this.name = "";
        this.age = 0;
    }

}

class Teacher2 extends Human {

    public void clear(PrintWriter pw) {

        this.name = "";
        this.age = 0;
    }

}
