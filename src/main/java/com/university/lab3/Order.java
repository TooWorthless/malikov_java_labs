package com.university.lab3;

import java.util.ArrayList;

public class Order {

     public enum OrderStatuses {
        CREATED,
        PENDING,
        PROCESSED,
    }


    private final int orderId;
    private ArrayList<Product> prods;
    private OrderStatuses status;

    
    public Order(int orderId, ArrayList<Product> prods)
    {
        this.orderId = orderId;
        this.prods = prods;
        this.status = OrderStatuses.CREATED;
    }

    public Order(int orderId, Cart cart)
    {
        this.orderId = orderId;
        this.prods = cart.getProds();
        this.status = OrderStatuses.CREATED;
    }


    public void PlaceOrder()
    {
        if(status == OrderStatuses.PROCESSED) {
            throw new RuntimeException("Attempt to place already processed order");
        }
        if(prods.isEmpty()) {
            throw new RuntimeException("Attempt to place an order with no products");
        }
        this.status = OrderStatuses.PENDING;
    }

    public void ProcessOrder()
    {
        if(status != OrderStatuses.PENDING) {
            throw new RuntimeException("Process non-placed order");
        }
        this.status = OrderStatuses.PROCESSED;
    }

    public int getOrderId() {
        return orderId;
    }

    public ArrayList<Product> getProds() {
        return prods;
    }

    public void setProds(ArrayList<Product> prods) {
        if(status == OrderStatuses.PROCESSED) {
            throw new RuntimeException("Order in process");
        }
        this.prods = prods;
    }

    public OrderStatuses getStatus() {
        return status;
    }
}
