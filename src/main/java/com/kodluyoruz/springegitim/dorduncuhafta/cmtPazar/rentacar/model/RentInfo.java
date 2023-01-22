package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.model;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.enums.RentType;

import javax.persistence.*;

@Entity
@Table(name = "RENT_INFO")
public class RentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Enumerated(EnumType.STRING)
    @Column
    private RentType rentType;

    @Column
    private double dailyRentPrice;

    @Column
    private double mounthlyRentPrice;

    @Column
    private double totalPrice;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CAR", foreignKey = @ForeignKey(name = "FK_RENTINFO_CAR"))
    private Car car;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CUSTOMER", foreignKey = @ForeignKey(name = "FK_RENTINFO_CUSTOMER"))
    private Customer customer;

    public RentInfo(RentType rentType, double dailyRentPrice, double mounthlyRentPrice) {
        this.rentType = rentType;
        this.dailyRentPrice = dailyRentPrice;
        this.mounthlyRentPrice = mounthlyRentPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public double getDailyRentPrice() {
        return dailyRentPrice;
    }

    public void setDailyRentPrice(double dailyRentPrice) {
        this.dailyRentPrice = dailyRentPrice;
    }

    public double getMounthlyRentPrice() {
        return mounthlyRentPrice;
    }

    public void setMounthlyRentPrice(double mounthlyRentPrice) {
        this.mounthlyRentPrice = mounthlyRentPrice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
