package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.controller;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.model.Car;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore.rentCar.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("getAllCar")
    public List<Car> getAllCarList(){
        return carService.getAllCars();
    }
}
