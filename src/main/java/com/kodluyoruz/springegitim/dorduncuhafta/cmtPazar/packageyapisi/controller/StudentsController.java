package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.packageyapisi.controller;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.packageyapisi.model.Student;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.packageyapisi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentsController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getStudentList")
    public List<Student> getStudentList(){
        return studentService.getStudentList();

    }

}
