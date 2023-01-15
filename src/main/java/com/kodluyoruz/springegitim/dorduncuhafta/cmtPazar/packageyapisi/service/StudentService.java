package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.packageyapisi.service;


import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.packageyapisi.model.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudentList() {
        Student student = null;
        student.setName("Fırat");
        return Arrays.asList(student);
    }

}
