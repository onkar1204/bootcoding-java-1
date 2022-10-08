package com.bootcoding.java.service;

import com.bootcoding.java.model.Customer;

public class CustomerService {
    public void registerCustomer(){
        Customer customer = new Customer();
        customer.setId(1);
        customer.setState("Up");
        customer.setDileveryAddress("ram nagar");
        customer.setCity("Nagpur");
        customer.print();
    }
}
