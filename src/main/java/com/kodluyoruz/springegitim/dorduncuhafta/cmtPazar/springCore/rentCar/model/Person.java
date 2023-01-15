package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.model;

import java.util.Date;

public class Person extends Customer {
    private int TCKN;
    private String surname;
    private Date birthDate;

    public int getTCKN() {
        return TCKN;
    }

    public void setTCKN(int TCKN) {
        this.TCKN = TCKN;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
