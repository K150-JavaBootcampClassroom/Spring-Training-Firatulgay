package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.services;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.RentInfo;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.enums.CarType;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.enums.RentType;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.model.Car;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getAllCars() {
        Car car = new Car(CarType.HATCHBACK,new RentInfo(RentType.MOUNTHLY,150,2500));
        Car car1 = new Car(CarType.HATCHBACK,new RentInfo(RentType.MOUNTHLY,150,2500));

        return Arrays.asList(car,car1);
    }

    @Override
    public List<Car> getCarById(long id) {
        return null;
    }
}
