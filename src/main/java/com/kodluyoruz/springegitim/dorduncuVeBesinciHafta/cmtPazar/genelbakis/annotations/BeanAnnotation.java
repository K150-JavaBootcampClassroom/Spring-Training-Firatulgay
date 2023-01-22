package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.genelbakis.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Configuration
public class BeanAnnotation {

    //methodlar bean annotation ile işaretlenir. Classın da bir spring beanı olması gerekir.

    List<Ogrenci> studentList;

    @PostConstruct
    public void initStudentData(){
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setAd("Fırat");

        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.setAd("Süleyman");

        Ogrenci ogrenci2 = new Ogrenci();
        ogrenci2.setAd("Aynur");

        studentList = Arrays.asList(ogrenci, ogrenci1, ogrenci2);
    }

    @Bean
    public TestBean getTestBean(){
        return new TestBean();
    }



}
