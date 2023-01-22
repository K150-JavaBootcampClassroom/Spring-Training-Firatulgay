package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Foo {
    private String name;
    private String surname;

    @Autowired
    private Dummy dummy;

    public Foo(Dummy dummy) {
        this.dummy = dummy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Dummy getDummy() {
        return dummy;
    }

    public void setDummy(Dummy dummy) {
        this.dummy = dummy;
    }
}
