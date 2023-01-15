package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.packageyapisi.controller;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.packageyapisi.model.student.Student;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.packageyapisi.service.StudenttService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class AdressController {
//https://www.google.com/api/student/getStudentAdressList
    @Autowired
    StudenttService studentService;

    @GetMapping("/getStudentList")
    public List<Student> getStudentList(){
        return null;

    }
}
