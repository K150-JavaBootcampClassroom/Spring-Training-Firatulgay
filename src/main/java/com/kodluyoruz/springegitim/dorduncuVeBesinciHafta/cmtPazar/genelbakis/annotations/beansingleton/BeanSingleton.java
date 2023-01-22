package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.genelbakis.annotations.beansingleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BeanSingleton implements CommandLineRunner {

    @Autowired
    private  DoctorService doctorService;
    @Autowired
    private  ManagerService managerService;


    @Override
    public void run(String... args) throws Exception {
        doctorService.getEmployeeValue();
        managerService.getEmployeeValue();
    }
}
