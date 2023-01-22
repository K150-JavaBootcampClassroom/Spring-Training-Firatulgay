package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.service;


import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.model.Car;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.model.Customer;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.strategies.IRentStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RentCarServiceImpl implements IRentCarService {

    @Qualifier("hatchBackStrategyImpl")
    @Autowired
    IRentStrategy iRentStrategy;

    @Override
    public void rentACar(Car car, Customer customer) {
        iRentStrategy.rentaCar(car,customer);
    }
}
