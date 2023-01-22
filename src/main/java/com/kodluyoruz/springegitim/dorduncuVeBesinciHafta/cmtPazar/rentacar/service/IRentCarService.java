package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.service;

import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Car;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Customer;

public interface IRentCarService {
    void rentACar(Car car, Customer customer);
}
