package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.security.config;

import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.dao.CarDao;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.dao.CustomerDao;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.enums.CarType;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.enums.FuelType;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.security.filter.AuthFilter;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Car;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Company;
import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Date;

@Configuration
public class CarConfig {

    @Bean
    public FilterRegistrationBean<> myFilterRegistrationBean() {
        FilterRegistrationBean<> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter();
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1);
        return registrationBean;
    }
//
    @Autowired
    CarDao carDao;
    
    @Autowired
    CustomerDao customerDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostConstruct
    public void insertInitData(){
        initCarData();
        initCustomerData();
    }

    private void initCustomerData() {
        Person person = new Person();
        person.setBirthDate(new Date());
        person.setSurname("Sis");
        person.setTCKN(123456);
        person.setName("Mustafa");
        person.setNationalty("Turkish");
        person.setPhone("123546687");
        person.setUsername("firat");
        person.setPassword(passwordEncoder.encode("1234"));

        Person person1 = new Person();
        person1.setBirthDate(new Date());
        person1.setSurname("Polat");
        person1.setTCKN(55555);
        person1.setName("Hasan");
        person1.setNationalty("Turkish");
        person1.setPhone("123546687");
        person1.setUsername("polat");
        person1.setPassword(passwordEncoder.encode("1234"));

        Person person2 = new Person();
        person2.setBirthDate(new Date());
        person2.setSurname("Yılmaz");
        person2.setTCKN(5533555);
        person2.setName("Süleyman");
        person2.setNationalty("Turkish");
        person2.setPhone("123546687");
        person.setUsername("yilmaz");
        person.setPassword(passwordEncoder.encode("1234"));

        Company company = new Company();
        company.setTaxNumber(564651231);
        company.setName("Kodluyoruz");
        company.setNationalty("English");
        company.setPhone("5345588552");
        company.setUsername("kodluyoruz");
        company.setPassword(passwordEncoder.encode("1234"));

        Company company1 = new Company();
        company1.setTaxNumber(564651231);
        company1.setName("S.I.S Motors");
        company1.setNationalty("English");
        company1.setPhone("5345588552");
        company.setUsername("sis");
        company.setPassword(passwordEncoder.encode("1234"));

        customerDao.saveAll(Arrays.asList(person,person1,person2,company,company1));
    }

    private void initCarData() {
        Car car = new Car();
        car.setCarType(CarType.HATCHBACK);
        car.setDoorCount(4);
        car.setFuelType(FuelType.BENZIN);
        car.setMaxSpeed(200);

        Car car1 = new Car();
        car1.setCarType(CarType.SEDAN);
        car1.setDoorCount(4);
        car1.setFuelType(FuelType.DIZEL);
        car1.setMaxSpeed(210);

        Car car2 = new Car();
        car2.setCarType(CarType.HATCHBACK);
        car2.setDoorCount(2);
        car2.setFuelType(FuelType.BENZIN);
        car2.setMaxSpeed(250);

        Car car3 = new Car();
        car3.setCarType(CarType.SEDAN);
        car3.setDoorCount(4);
        car3.setFuelType(FuelType.DIZEL);
        car3.setMaxSpeed(300);

        carDao.saveAll(Arrays.asList(car,car1,car2,car3));
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
