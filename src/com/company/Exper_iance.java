package com.company;

import java.util.ArrayList;

public class Exper_iance{
    private String where;

    public Exper_iance(String where, String date, String position, ArrayList<Exper_iance> duty) {
        this.where = where;
        this.date = date;
        this.position = position;
        this.duty = duty;
    }

    private String date;
    private String date2;
    private String position;

    public Exper_iance() {
        
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    private ArrayList<Exper_iance> duty;

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public ArrayList<Exper_iance> getDuty() {
        return duty;
    }

    public void setDuty(ArrayList<Exper_iance> duty) {
        this.duty = duty;
    }

    public Exper_iance(ArrayList<Exper_iance> duty) {
        this.duty = duty;
    }

    public void setDuty(String next) {
    }
}



