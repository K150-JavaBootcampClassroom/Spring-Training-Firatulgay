package com.kodluyoruz.springegitim.dorduncuhafta.cmtPazar.genelbakis.httpmethodlari.model;

public class OrganizationSaveRequestDto {

    String organizationName;
    String address;

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
