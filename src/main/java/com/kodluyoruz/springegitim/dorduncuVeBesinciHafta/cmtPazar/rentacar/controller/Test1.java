package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.controller;

import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.dao.CarDao;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.exceptions.CarNotFoundException;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test1")
public class Test1 {
    @Autowired
    CarDao carDao;

    @GetMapping
    public List<Car> getAllCars(){
        throw new CarNotFoundException("No cars found !!");
    }
}
