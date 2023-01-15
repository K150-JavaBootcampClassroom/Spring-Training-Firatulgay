package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.strategies;


import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.model.Car;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.model.Customer;

public interface IRentStrategy {
    void rentaCar(Car car, Customer customer);
}
