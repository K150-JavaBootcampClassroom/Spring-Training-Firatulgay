package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.springCore;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringXMLConfigurationMain {
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Test test = (Test)ac.getBean("test");
        Foo fooTest = test.getFoo();

        Bar barBean = (Bar) ac.getBean("bar");
        Foo fooBar = barBean.getFoo();

        System.out.println(fooBar == fooTest);
//
//        Dummy dummy = barBean.getDummy();
//        System.out.println(foo);
//
//        Foo fooBean = (Foo) ac.getBean("foo");
//        String name = fooBean.getName();
//        Dummy dummy1 = fooBean.getDummy();
//        System.out.println(name);
//
//        System.out.println(dummy == dummy1);
//        ac.close();

    }
}
