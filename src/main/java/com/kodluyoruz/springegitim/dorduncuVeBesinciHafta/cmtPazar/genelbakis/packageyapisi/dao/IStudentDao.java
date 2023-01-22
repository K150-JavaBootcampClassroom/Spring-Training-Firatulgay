package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.genelbakis.packageyapisi.dao;

import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.genelbakis.packageyapisi.model.student.Student;

import java.util.List;

public interface IStudentDao {
    List<Student> getStudentList();
    void saveStudent(Student student);
    void deleteStudentById(int id);
}
