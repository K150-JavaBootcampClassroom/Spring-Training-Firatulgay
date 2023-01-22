package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.strategies;


import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Car;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Customer;

public interface IRentStrategy {
    void rentaCar(Car car, Customer customer);
}
