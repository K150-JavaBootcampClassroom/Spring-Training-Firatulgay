package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.jdbcexample.service;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.jdbcexample.mapper.StudentMapper;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.jdbcexample.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class StudentsService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostConstruct
    void initData(){
        final String sqlCreate = "CREATE TABLE Student (\n" +
                "    NO INT,\n" +
                "    NAME VARCHAR(255)\n" +
                ")";

        jdbcTemplate.execute(sqlCreate);

        final String sqlInsert = "INSERT INTO Student (NO, NAME) VALUES (1, 'Fırat');\n" +
                "INSERT INTO Student (NO, NAME) VALUES (2, 'Murat');\n" +
                "INSERT INTO Student (NO, NAME) VALUES (3, 'Batuhan');";

        jdbcTemplate.execute(sqlInsert);

    }

    public List<Student> getStudentsList() {

        String sql = "select * from student";

        List<Student> query = jdbcTemplate.query(sql, new StudentMapper());
        return query;

    }

//    SQL injection'a açık bir kod bloğu -> abc' or '1' = '1

    public List<Student> getStudentsList(String name){

        String sql = "select * from student s where name=" + "'"+name+"'" ;
        return jdbcTemplate.query(sql, new StudentMapper());

    }
//    public List<Student> getStudentsList(String name) {
//
//        String sql = "select * from student s where name = ?";
//
//        return jdbcTemplate.query(sql,new Object[]{name}, new StudentMapper());
//
//    }

//    public List<Student> getStudentsList(String name, String lastName) {
////
////        String sql = "select * from student s where s.name = ? and s.lastName = ?";
////
////        return jdbcTemplate.query(sql,new Object[]{name, lastName}, new StudentMapper());
////
////    }

}
