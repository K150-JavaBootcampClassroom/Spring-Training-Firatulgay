package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.di;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.annotations.OgrenciService;
import org.springframework.stereotype.Component;

@Component
public class DIYontemleri {

    //ilk DI yöntemi Constructor

    private final OgrenciService ogrenciService; //spring 4.3 ve sonrası için autowired yazmaya gerek yok

    public DIYontemleri(OgrenciService ogrenciService) {
        this.ogrenciService = ogrenciService;
    }

    // private OgrenciService ogrenciService;

//    @Autowired
//    public DIYontemleri(OgrenciService ogrenciService){
//        this.ogrenciService = ogrenciService;
//    }

   // @Autowired
    //public void setOgrenciService(OgrenciService ogrenciService) {
     //   this.ogrenciService = ogrenciService;
    //}

    //Field injection
}
