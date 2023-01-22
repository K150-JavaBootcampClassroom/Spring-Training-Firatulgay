package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.dao;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.rentacar.model.RentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentInfoDao extends JpaRepository<RentInfo,Long> {
}
