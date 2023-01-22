package com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.dao;

import com.kodluyoruz.springegitim.dorduncuVeBesinciHafta.cmtPazar.rentacar.model.RentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentInfoDao extends JpaRepository<RentInfo,Long> {
}
