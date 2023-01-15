package com.kodluyoruz;

import org.h2.jdbc.JdbcConnection;
import org.h2.tools.RunScript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
