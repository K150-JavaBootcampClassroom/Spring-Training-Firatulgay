package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.model;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.model.Customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Person extends Customer {
    @Column
    private int TCKN;

    @Column
    private String surname;

    @Column
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
