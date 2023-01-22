package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.genelbakis.packageyapisi.controller;

import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.genelbakis.packageyapisi.model.student.Student;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.genelbakis.packageyapisi.service.StudenttService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController  {
//www.google.com/student/getStudentsList

    // localhost:8095/student/getStudentsList

    @Autowired
    StudenttService studentService;

//    @GetMapping(value = "/getStudentsList")
//    public List<StudentDto> getStudentList(){
//        return studentService.getStudenttList();
//    }

    @PostMapping(value = "/saveStudent")
    public void saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }

    @DeleteMapping(value = "/v1/deleteStudentById/{number}")
    public void deleteStudentById(@PathVariable int number){
        studentService.deleteById(number);
    }

    @DeleteMapping(value = "/v2/deleteStudentById")
    public void deleteStudentByIdV2(@RequestParam("number") int number){
        studentService.deleteById(number);
    }
}
