package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.json;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/siparis")
public class SiparisController {

    @PostMapping("/siparisKaydet")
    public void siparisKaydet(@RequestBody SiparisSaveRequestBody siparisSaveRequestBody){
        System.out.println(siparisSaveRequestBody);

    }

}
