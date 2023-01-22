package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.dao;

import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDao extends JpaRepository<Car,Long> {
}
