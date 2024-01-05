package com.university.lab3;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class GeneralSystemTest {

    @Test
    public void testAddProductToCart() {
        Cart cart = new Cart();
        cart.addProd(new Product(1, "PC", 500F));
        assertEquals(1, cart.getProds().size());
    }

    @Test
    public void testRemoveProductFromCart() {
        Cart cart = new Cart();
        Product prod = new Product(1, "GPU", 500F);
        cart.addProd(prod);
        cart.delProd(prod);
        assertEquals(0, cart.getProds().size());
    }

    @Test
    public void testPlaceOrder() {
        Cart cart = mock(Cart.class);
        Product prod = new Product(1, "GPU", 500F);
        ArrayList<Product> alp = new ArrayList<>();
        alp.add(prod);
        when(cart.getProds()).thenReturn(alp);
        Order order = new Order(1, cart.getProds());
        assertEquals(1, order.getProds().size());
        assertEquals(OrderStatus.CREATED, order.getStatus());
    }

    @Test
    public void testUpdateOrderStatus() {
        ArrayList<Product> alp = new ArrayList<>();
        Order order = new Order(1, alp);
        order.setStatus(OrderStatus.PROCESSED);
        assertEquals(OrderStatus.PROCESSED, order.getStatus());
    }

    @Test
    public void testGetOrderStatus() {
        Order order = mock(Order.class);
        when(order.getStatus()).thenReturn(OrderStatus.PROCESSED);
        OrderStatus status = order.getStatus();
        assertEquals(OrderStatus.PROCESSED, status);
    }
}