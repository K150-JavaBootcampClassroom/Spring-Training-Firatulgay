package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.strategies;


import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Car;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Customer;
import org.springframework.stereotype.Component;

@Component("suvStrategyImpl")
public class SUVStrategyImpl implements IRentStrategy {

    @Override
    public void rentaCar(Car car , Customer customer) {
        System.out.println("SUV kiralama");
    }
}
