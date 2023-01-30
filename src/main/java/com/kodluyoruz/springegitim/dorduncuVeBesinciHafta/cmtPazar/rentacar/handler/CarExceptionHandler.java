package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.handler;

import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.exceptions.CarNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CarExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = { CarNotFoundException.class})
    protected ResponseEntity handleCarException(CarNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
    }
}
