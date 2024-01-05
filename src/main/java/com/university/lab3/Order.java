package com.university.lab3;

import java.util.ArrayList;

public class Order {

    private final int orderId;
    private ArrayList<Product> prods;
    private OrderStatus status;

    
    public Order(int orderId, ArrayList<Product> prods)
    {
        this.orderId = orderId;
        this.prods = prods;
        this.status = OrderStatus.CREATED;
    }

    public Order(int orderId, Cart cart)
    {
        this.orderId = orderId;
        this.prods = cart.getProds();
        this.status = OrderStatus.CREATED;
    }


    public void PlaceOrder()
    {
        if(status == OrderStatus.PROCESSED) {
            throw new RuntimeException("Attempt to place already processed order");
        }
        if(prods.isEmpty()) {
            throw new RuntimeException("Attempt to place an order with no products");
        }
        this.status = OrderStatus.PENDING;
    }

    public void ProcessOrder()
    {
        if(status != OrderStatus.PENDING) {
            throw new RuntimeException("Process non-placed order");
        }
        this.status = OrderStatus.PROCESSED;
    }

    public int getOrderId() {
        return orderId;
    }

    public ArrayList<Product> getProds() {
        return prods;
    }

    public void setProds(ArrayList<Product> prods) {
        if(status == OrderStatus.PROCESSED) {
            throw new RuntimeException("Order in process");
        }
        this.prods = prods;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }
}
