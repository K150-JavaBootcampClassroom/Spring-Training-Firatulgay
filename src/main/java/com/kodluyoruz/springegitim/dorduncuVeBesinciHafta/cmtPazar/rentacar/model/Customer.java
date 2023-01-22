package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String nationalty;
    @Column
    private String name;
    @Column
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationalty() {
        return nationalty;
    }

    public void setNationalty(String nationalty) {
        this.nationalty = nationalty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
