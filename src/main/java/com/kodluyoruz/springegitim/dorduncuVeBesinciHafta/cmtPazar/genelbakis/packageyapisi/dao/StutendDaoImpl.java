package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.genelbakis.packageyapisi.dao;

import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.genelbakis.packageyapisi.model.student.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StutendDaoImpl implements IStudentDao {

    @Override
    public List<Student> getStudentList() {
        return null;
    }

    @Override
    public void saveStudent(Student student) {

    }

    @Override
    public void deleteStudentById(int id) {

    }
}
