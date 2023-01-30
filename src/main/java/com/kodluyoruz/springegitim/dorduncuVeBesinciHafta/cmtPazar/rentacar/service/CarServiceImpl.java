package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.service;

import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.dao.CarDao;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.dto.CarDto;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.enums.CarType;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.exceptions.CarNotFoundException;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements ICarService{

    @Autowired
    private CarDao carDao;

    @Override
    public CarDto getCarById(long id) {
        Car car = carDao.getCarById(id);
        if (car == null){
            throw new CarNotFoundException("Gönderdiğiniz " + id +"'li" + "araca air bilgi bulunmamaktadır");
        }

        CarDto carDto = convertToCarDto(car);
        return carDto;
    }

    public List<CarDto> getCarByCarType(CarType carType){
        List<Car> carList = carDao.getCarByCarType(carType);

        if (CollectionUtils.isEmpty(carList)){
            throw new CarNotFoundException("Araca air bilgi bulunmamaktadır");
        }
        List<CarDto> carDtoList = new ArrayList<>();

        for (Car car : carList) {
            CarDto carDto = convertToCarDto(car);
            carDtoList.add(carDto);
        }

        return carDtoList;
    }

    @Transactional
    @Override
    public void saveCar(Car car) {
        Car savedCar = carDao.save(car);
        int doorCount = savedCar.getDoorCount();
        Long doorCount1 = (long) doorCount;
        System.out.println(2/doorCount1);
    }


    private CarDto convertToCarDto(Car car) {
        CarDto carDto = new CarDto();
        carDto.setId(car.getId());
        carDto.setCarType(car.getCarType());
        carDto.setFuelType(car.getFuelType());
        carDto.setMaxSpeed(car.getMaxSpeed());
        return carDto;
    }
}
