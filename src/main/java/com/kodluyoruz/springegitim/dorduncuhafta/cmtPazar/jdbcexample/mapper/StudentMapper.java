package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.jdbcexample.mapper;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.jdbcexample.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student studentDto = new Student();
        studentDto.setName(rs.getString("NAME"));
        studentDto.setNo(rs.getInt("NO"));

        return studentDto;
    }
}
