package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.strategies;


import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.model.Car;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class SedanStrategyImpl implements IRentStrategy {
    @Override
    public void rentaCar(Car car, Customer customer) {
        System.out.println("Sedan Kiralama");
    }
}
