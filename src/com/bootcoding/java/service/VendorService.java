package com.bootcoding.java.service;

import com.bootcoding.java.model.Vendor;

import java.util.Date;

public class VendorService {
public void registerVendor(){
    Vendor vendor = new Vendor();
    vendor.setId(1);
    vendor.setState("MP");
    vendor.setCity("ind");
    vendor.setRegistrationDate(new Date());
    vendor.print();
}
}
