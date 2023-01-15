package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.packageyapisi.model.student;

import java.util.Date;

public class Student {

    private String name;
    private int number;
    private String TCKCN;
    private Date birthday;
    private String anaAdi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTCKCN() {
        return TCKCN;
    }

    public void setTCKCN(String TCKCN) {
        this.TCKCN = TCKCN;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAnaAdi() {
        return anaAdi;
    }

    public void setAnaAdi(String anaAdi) {
        this.anaAdi = anaAdi;
    }
}
