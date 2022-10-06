package com.bootcoding.java.app;

import com.bootcoding.java.model.Customer;

public class Application {
    public static void main(String[] args) {
        Customer jayesh = new Customer();
        jayesh.setName("Jayesh G Harle");
        jayesh.setCity("Nagpur");
        jayesh.setState("maharashtra");
        jayesh.setDileveryAddress("xyz");
        jayesh.print();
        Customer mohit = new Customer();
        mohit.setName("Mohit G Harle");
        mohit.setCity("Pune");
        mohit.setState("UP");
        mohit.setDileveryAddress("abc");
        mohit.print();
        Customer pratik = new Customer();
        pratik.setName("Pratik P Zode");
        pratik.setCity("Mumbai");
        pratik.setState("MP");
        pratik.setDileveryAddress("abc");
        pratik.print();
    }
}
