package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.packageyapisi.service;


import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.packageyapisi.configuration.GeneralConfiguration;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.packageyapisi.convert.StudentConverter;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.packageyapisi.dto.StudentDto;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.packageyapisi.model.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudenttService {

    @Autowired
    StudentConverter converter;

    public List<StudentDto> getStudenttList() {

        List<Student> studentList = GeneralConfiguration.studentList;
        List<StudentDto> studentDtoList = new ArrayList<>();

        for (Student student : studentList) {
            StudentDto studentDto = converter.studentConvert(student);
            studentDtoList.add(studentDto);
        }
        return studentDtoList;
    }

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
