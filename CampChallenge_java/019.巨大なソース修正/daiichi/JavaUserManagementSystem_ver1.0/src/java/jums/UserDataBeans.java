/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;

import java.io.Serializable;

/**
 *
 * @author tsujitatsuya
 */
public class UserDataBeans implements Serializable {

    private String name = "";
    private String year = "";
    private String month = "";
    private String day = "";
    private String type = "";
    private String tell = "";
    private String comment = "";
    private int typeNum = 0;

    public UserDataBeans() {
    }

    ;
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.equals("1")) {
            this.type = "エンジニア";
        }
        if (type.equals("2")) {
            this.type = "営業";
        }
       if (type.equals("3")) {
           this.type = "その他";
       }
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(int typeNum) {
        this.typeNum = typeNum;
    }

}
