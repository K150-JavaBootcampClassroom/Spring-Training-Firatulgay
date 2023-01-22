package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bar {
    private int count;
    private int id;

    @Autowired
    private Foo foo;

    @Autowired
    private Dummy dummy;

//    @Autowired
//
//    @Autowired
//    private Test test;

//    public Bar(Foo foo, Dummy dummy) {
//        this.foo = foo;
//        this.dummy = dummy;
//    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    public Dummy getDummy() {
        return dummy;
    }

    public void setDummy(Dummy dummy) {
        this.dummy = dummy;
    }
//
//    public Test getTest() {
//        return test;
//    }
//
//    public void setTest(Test test) {
//        this.test = test;
//    }
}
