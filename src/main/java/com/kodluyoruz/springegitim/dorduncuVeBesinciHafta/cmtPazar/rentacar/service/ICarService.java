package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.service;

import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.dto.CarDto;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.enums.CarType;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Car;

import java.util.List;

public interface ICarService {
    CarDto getCarById(long id);
    List<CarDto> getCarByCarType(CarType carType);

    void saveCar(Car car);
}
