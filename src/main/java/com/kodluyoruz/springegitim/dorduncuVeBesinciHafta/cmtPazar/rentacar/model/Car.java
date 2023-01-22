package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model;

import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.enums.CarType;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.enums.FuelType;

import javax.persistence.*;

@Entity
@Table(name = "CAR")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private int doorCount;

    @Enumerated(EnumType.STRING)
    @Column
    private FuelType fuelType;

    @Column
    private int maxSpeed;

    @Enumerated(EnumType.STRING)
    @Column
    private CarType carType;

    public Car(CarType carType) {
        this.carType = carType;
    }

    public Car() {
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
}
