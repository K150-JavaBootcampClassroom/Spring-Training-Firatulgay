package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.services;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();
    List<Car> getCarById(long id);
}
