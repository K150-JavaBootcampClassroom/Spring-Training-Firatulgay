package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.services;


import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.model.Car;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.model.Customer;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.strategies.IRentStrategy;

public class RentCarServiceImpl implements IRentCarService {

    IRentStrategy iRentStrategy;

    @Override
    public void rentACar(Car car, Customer customer) {
        iRentStrategy.rentaCar(car,customer);
    }

    public RentCarServiceImpl(IRentStrategy iRentStrategy) {
        this.iRentStrategy = iRentStrategy;
    }
}
