package com.university.lab3;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product(0, "EnergyDrink", 11.11);
        Product prod2 = new Product(1, "Apple", 5.99);
        Product prod3 = new Product(2, "Pineaple", 26.56);


        Cart cart = new Cart();
        cart.addProd(prod1, prod2, prod3);


        Order order = new Order(0, cart);
        System.out.println(order.getStatus());

        order.PlaceOrder();
        System.out.println(order.getStatus());
        
        order.ProcessOrder();
        System.out.println(order.getStatus());
    }
}