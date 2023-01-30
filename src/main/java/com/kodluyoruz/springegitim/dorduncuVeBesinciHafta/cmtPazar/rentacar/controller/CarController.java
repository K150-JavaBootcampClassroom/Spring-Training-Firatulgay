package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.controller;

import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.dao.CarDao;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.exceptions.CarNotFoundException;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Car;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    CarDao carDao;
    @Autowired
    ICarService carService;

    @GetMapping
    public List<Car> getAllCars(){
        return carDao.findAll();
    }

    @PostMapping("/saveCar")
    void saveCar(@RequestBody Car car){
        carService.saveCar(car);
    }
}
