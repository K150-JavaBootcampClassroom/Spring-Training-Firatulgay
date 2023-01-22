package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.dao;

import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer,Long> {
}
