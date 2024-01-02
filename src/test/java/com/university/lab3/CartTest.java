package com.university.lab3;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CartTest {
    
    private Cart cart;

    @BeforeEach
    void setUp() {
        cart = new Cart();
    }

    @Test
    void testAddItems() {
        Product prod1 = new Product(0, "testProd0", 100);
        Product prod2 = new Product(1, "testProd1", 111.11);

        cart.addProd(prod1, prod2);
        ArrayList<Product> productsInCart = cart.getProds();

        assertTrue(productsInCart.contains(prod1));
        assertTrue(productsInCart.contains(prod2));
    }

    @Test
    void testDelExistingItem() {
        Product product1 = new Product(0, "testProd0", 100);
        cart.addProd(product1);
        cart.delProd(product1);
        ArrayList<Product> productsInCart = cart.getProds();
        assertFalse(productsInCart.contains(product1));
    }

    @Test
    void testDelNonExistingItem() {
        Product product1 = new Product(0, "testProd0", 100);
        assertThrows(RuntimeException.class, () -> cart.delProd(product1));
    }
}
