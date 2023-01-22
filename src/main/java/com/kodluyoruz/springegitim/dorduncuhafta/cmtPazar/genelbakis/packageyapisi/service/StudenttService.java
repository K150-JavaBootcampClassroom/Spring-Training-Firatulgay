package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.packageyapisi.service;


import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.packageyapisi.configuration.GeneralConfiguration;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.packageyapisi.dto.StudentDto;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.packageyapisi.model.Teacher;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.packageyapisi.model.TeacherDto;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.packageyapisi.model.student.Student;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.jdbcexample.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudenttService {

//    @Autowired
//    Converter<Student,StudentDto> studentconverter;
//
//    @Autowired
//    Converter<Teacher, TeacherDto> teacherconverter;


//    public List<StudentDto> getStudenttList() {
//
//        List<Student> studentList = GeneralConfiguration.studentList;
////        List<StudentDto> studentDtoList = studentconverter.convertToList(studentList);
//
//        return studentDtoList;
//    }

    public void saveStudent(Student student){
        GeneralConfiguration.studentList.add(student);
    }

    public void deleteById(int number) {
        List<Student> studentList = GeneralConfiguration.studentList;
        for (Student student : studentList) {
            if (student.getNumber() == number){
                studentList.remove(student);
            }
        }
    }
}
