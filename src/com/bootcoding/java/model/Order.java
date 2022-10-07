package com.bootcoding.java.model;

import java.util.List;

public class Order {
    long CustomerId;
    long VendorId;
    double totalPrice;
    String deliveryAddress;

    public long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(long customerId) {
        CustomerId = customerId;
    }

    public long getVendorId() {
        return VendorId;
    }

    public void setVendorId(long vendorId) {
        VendorId = vendorId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<MenuItem> getManuItems() {
        return manuItems;
    }

    public void setManuItems(List<MenuItem> manuItems) {
        this.manuItems = manuItems;
    }

    OrderStatus status;
    List <MenuItem> manuItems;
    public void print(){
        System.out.println(getCustomerId());
        System.out.println(getStatus());
        System.out.println(getDeliveryAddress());
        System.out.println(getTotalPrice());
    }
}
