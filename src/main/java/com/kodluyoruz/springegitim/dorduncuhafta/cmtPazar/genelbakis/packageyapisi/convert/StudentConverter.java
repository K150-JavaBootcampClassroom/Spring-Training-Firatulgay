package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.packageyapisi.convert;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.packageyapisi.dto.StudentDto;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.packageyapisi.model.student.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentConverter {

    public StudentDto studentConvert(Student student){
        StudentDto studentDto = new StudentDto();

        studentDto.setName(student.getName());
        studentDto.setNumber(student.getNumber());

        return studentDto;
    }

}
