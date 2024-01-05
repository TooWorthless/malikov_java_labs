package com.university.lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderTest {
    private Cart cart;
    private ArrayList<Product> prods;

    @BeforeEach
    void setUp() {
        cart = new Cart();
        prods = new ArrayList<>();

        Product prod1 = new Product(0, "testProd0", 100);
        Product prod2 = new Product(1, "testProd1", 111.11);

        cart.addProd(prod1, prod2);

        prods.add(prod1);
        prods.add(prod2);
    }

    @Test
    public void testGetOrderStatus() {
        Order order = new Order(1, prods);
        assertEquals(OrderStatus.CREATED, order.getStatus());

        order.PlaceOrder();
        assertEquals(OrderStatus.PENDING, order.getStatus());

        order.ProcessOrder();
        assertEquals(OrderStatus.PROCESSED, order.getStatus());
    }

    @Test
    public void testCreateOrderWithArrayList() {
        Order order = new Order(1, prods);
        assertEquals(1, order.getOrderId());
        assertEquals(OrderStatus.CREATED, order.getStatus());
        assertEquals(prods, order.getProds());
    }

    @Test
    public void testCreateOrderWithCart() {
        Order order = new Order(1, cart);
        assertEquals(1, order.getOrderId());
        assertEquals(OrderStatus.CREATED, order.getStatus());
        assertEquals(cart.getProds(), order.getProds());
    }

    @Test
    public void testPlaceOrder() {
        Order order = new Order(1, prods);
        order.PlaceOrder();
        assertEquals(OrderStatus.PENDING, order.getStatus());
    }

    @Test
    public void testPlaceEmptyOrder() {
        Order order = new Order(1, new ArrayList<>());
        assertThrows(RuntimeException.class, order::PlaceOrder);
    }

    @Test
    public void testProcessOrder() {
        Order order = new Order(1, prods);

        order.PlaceOrder();
        order.ProcessOrder();

        assertEquals(OrderStatus.PROCESSED, order.getStatus());
    }

    @Test
    public void testProcessNonPlacedOrder() {
        Order order = new Order(1, prods);
        assertThrows(RuntimeException.class, order::ProcessOrder);
    }

    @Test
    public void testSetProdsOnProcessedOrder() {
        Order order = new Order(1, prods);

        order.PlaceOrder();
        order.ProcessOrder();

        ArrayList emptyList = new ArrayList<>();
        assertThrows(RuntimeException.class, () -> order.setProds(emptyList));
    }
}
