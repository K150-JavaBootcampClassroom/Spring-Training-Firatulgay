package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.springCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    Test test;

    @Bean
    public Test getTest(){
        return test = new Test();
    }

}
