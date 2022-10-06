package com.bootcoding.java.model;

import java.util.List;

public class Order {
    long CustomerId;
    long VendorId;
    double totalPrice;
    String deliveryAddress;
    OrderStatus status;
    List <MenuItem> manuItems;
}
