package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.exceptions;

public class CarNotFoundException extends RuntimeException {

    public CarNotFoundException(String message) {
        super(message);
    }
}
