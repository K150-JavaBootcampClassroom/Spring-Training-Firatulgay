package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.model;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.model.Customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Company extends Customer {
    @Column
    private int taxNumber;

    public int getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }
}
