package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.genelbakis.packageyapisi.configuration;


import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.genelbakis.packageyapisi.model.student.Student;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
public class GeneralConfiguration {

    public static List<Student> studentList = new ArrayList<>();

    @PostConstruct
    public void fillStudentList(){
        Student student = new Student();
        student.setName("Fırat");
        student.setNumber(123);
        student.setAnaAdi("ayşe");
        student.setTCKCN("1232563456");
        student.setBirthday(new Date());

        Student student1 = new Student();
        student1.setName("Doruk");
        student1.setNumber(234);
        student1.setAnaAdi("fatma");
        student1.setTCKCN("34534657");
        student1.setBirthday(new Date());

        studentList.add(student);
        studentList.add(student1);
    }
}
