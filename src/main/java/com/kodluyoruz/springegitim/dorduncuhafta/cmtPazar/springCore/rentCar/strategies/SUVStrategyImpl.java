package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.strategies;


import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.model.Car;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.model.Customer;

public class SUVStrategyImpl implements IRentStrategy {

    @Override
    public void rentaCar(Car car , Customer customer) {
        System.out.println("SUV kiralama");
    }
}
