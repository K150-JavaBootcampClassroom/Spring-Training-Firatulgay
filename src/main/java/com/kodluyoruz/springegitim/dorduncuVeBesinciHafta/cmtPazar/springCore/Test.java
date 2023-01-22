package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test {

    @Autowired
    private Bar bar ;
    @Autowired
    private Dummy dummy;
    @Autowired
    private Foo foo;

    void writeBeans(){
        System.out.println(dummy);
        System.out.println(foo);
        System.out.println(bar);
    }

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public Dummy getDummy() {
        return dummy;
    }

    public void setDummy(Dummy dummy) {
        this.dummy = dummy;
    }

    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }
}
