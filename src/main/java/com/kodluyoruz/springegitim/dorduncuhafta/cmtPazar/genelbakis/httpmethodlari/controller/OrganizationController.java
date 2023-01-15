package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.httpmethodlari.controller;

import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.httpmethodlari.model.Organization;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.httpmethodlari.model.OrganizationSaveRequestDto;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.httpmethodlari.model.OrganizationUpdateRequestDto;
import com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.httpmethodlari.servis.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/organization")
public class OrganizationController {

    @Autowired
    OrganizationService organizationService;

    @GetMapping("/getOrganization")
    public Organization getOrganization(@RequestParam(value = "orgId", required = false) int organizationId){
        return organizationService.getOrganization(organizationId);

    }

    @PostMapping("/saveOrganization")
    public boolean saveOrganization(@RequestBody OrganizationSaveRequestDto organizationSaveRequestBody){
        return organizationService.saveOrganization(organizationSaveRequestBody);

    }

    @PutMapping("/updateOrganization")
    public boolean updateOrganization(@RequestBody OrganizationUpdateRequestDto organizationUpdateRequestBody){
        return organizationService.updateOrganization(organizationUpdateRequestBody);

    }

    @DeleteMapping("/deleteOrganization")
    public boolean updateOrganization(@RequestParam int organizationId){
        return organizationService.deleteOrganization(organizationId);

    }

}
