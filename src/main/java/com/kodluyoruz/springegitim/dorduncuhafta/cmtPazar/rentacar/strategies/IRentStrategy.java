package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.strategies;


import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.model.Car;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.model.Customer;

public interface IRentStrategy {
    void rentaCar(Car car, Customer customer);
}
