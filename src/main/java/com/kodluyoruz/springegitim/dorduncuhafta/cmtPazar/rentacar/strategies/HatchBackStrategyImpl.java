package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.strategies;


import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.model.Car;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.model.Customer;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.model.Person;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.enums.RentType;
import org.springframework.stereotype.Component;

@Component
public class HatchBackStrategyImpl implements IRentStrategy {
    @Override
    public void rentaCar(Car car, Customer customer) {
        System.out.println("Hatchback Kiralama");
    }
}
