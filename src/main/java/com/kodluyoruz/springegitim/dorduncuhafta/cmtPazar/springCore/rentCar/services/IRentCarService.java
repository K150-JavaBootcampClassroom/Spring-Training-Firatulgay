package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.services;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.model.Car;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.model.Customer;

public interface IRentCarService {
    public void rentACar(Car car, Customer customer);
}
