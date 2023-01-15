package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.jdbcexample.controller;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.jdbcexample.model.Student;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.jdbcexample.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudenttController {

    @Autowired
    StudentsService studentService;

    @GetMapping("/v1/studentList")
    public List<Student> getStudentList(){
       return studentService.getStudentsList();
    }


    @GetMapping("/getAllStudentList")
    public List<Student> getStudentList(@RequestParam String name){
        return studentService.getStudentsList(name);
    }


}
