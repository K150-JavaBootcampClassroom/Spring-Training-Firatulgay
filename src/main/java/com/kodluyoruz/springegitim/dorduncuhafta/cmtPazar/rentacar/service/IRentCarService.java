package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.service;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.model.Car;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.model.Customer;

public interface IRentCarService {
    void rentACar(Car car, Customer customer);
}
