package com.company;

public class atm {
    private Integer txt1;
    private String txt2;


    public atm(Integer txt1) {
        this.txt1 = txt1;
    }

    public atm(String txt2) {
        this.txt2 = txt2;
    }

    public Integer getTxt1() {
        return txt1;
    }

    public void setTxt1(Integer txt1) {
        this.txt1 = txt1;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }
}
