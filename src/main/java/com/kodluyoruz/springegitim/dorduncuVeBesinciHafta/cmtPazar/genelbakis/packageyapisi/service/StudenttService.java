package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.genelbakis.packageyapisi.service;


import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.genelbakis.packageyapisi.configuration.GeneralConfiguration;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.genelbakis.packageyapisi.model.student.Student;
import org.springframework.stereotype.Service;

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
