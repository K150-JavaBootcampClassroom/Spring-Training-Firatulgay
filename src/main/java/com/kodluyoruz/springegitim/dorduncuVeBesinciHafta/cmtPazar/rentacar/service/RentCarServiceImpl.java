package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.service;


import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Car;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Customer;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.strategies.IRentStrategy;
import org.springframework.stereotype.Service;

@Service
public class RentCarServiceImpl implements IRentCarService {

    IRentStrategy hatchBackStategy;


    @Override
    public void rentACar(Car car, Customer customer) {

        hatchBackStategy.rentaCar(car,customer);
    }

    public IRentStrategy getHatchBackStategy() {
        return hatchBackStategy;
    }


    public void setHatchBackStategy(IRentStrategy hatchBackStategy) {
        this.hatchBackStategy = hatchBackStategy;
    }
}
