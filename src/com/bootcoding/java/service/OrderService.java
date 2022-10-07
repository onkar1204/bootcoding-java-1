package com.bootcoding.java.service;

import com.bootcoding.java.model.Order;
import com.bootcoding.java.model.OrderStatus;

public class OrderService {
    public boolean createOrder() {
        Order order = new Order();
        order.setCustomerId(1);
        order.setStatus(OrderStatus.NEW);
        order.setDeliveryAddress("yogeshwar nagar");
        order.setTotalPrice(40);
        order.print();
        System.out.println("your order is placed");
        double price = applyDiscount(order.getTotalPrice());
        System.out.println("total price after applying discount");
        return true;

    }
    public double applyDiscount(double price){
        double discountamount = price * 0.1;
        return price - discountamount;

    }
}
