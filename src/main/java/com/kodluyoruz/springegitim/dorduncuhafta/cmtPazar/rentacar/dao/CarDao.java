package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.dao;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDao extends JpaRepository<Car,Long> {
}
