package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.annotations;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.annotations.beansingleton.ManagerService;
import org.springframework.stereotype.Service;

@Service
public class AutowiredUsage {

    private ManagerService managerService;

    // ManagerService managerService = new ManagerService();
    // AutowiredUsage usage = new AutowiredUsage(managerService);
    //
    // usage

//    @Autowired
//    public AutowiredUsage(ManagerService managerService){
//        this.managerService = managerService;
//    }

//    @Autowired
//    public void setManagerService(ManagerService managerService) {
//        this.managerService = managerService;
//    }
}
