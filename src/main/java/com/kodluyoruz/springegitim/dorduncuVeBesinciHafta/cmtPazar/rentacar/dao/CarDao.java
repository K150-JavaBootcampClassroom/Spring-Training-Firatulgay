package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.dao;

import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.enums.CarType;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarDao extends JpaRepository<Car,Long> {
    Car getCarById(long id);
    List<Car> getCarByCarType(CarType carType);
}
