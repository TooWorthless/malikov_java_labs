package com.university.lab3;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest {
    private Product prod;

    @BeforeEach
    void setUp() {
        prod = new Product(0, "testProd0", 111.11);
    }
    @Test
    void productWithIllegalName() {
        assertThrows(IllegalArgumentException.class, () -> new Product(0, "", 111.11));
        assertThrows(IllegalArgumentException.class, () -> prod.setName(""));
    }
    @Test
    void prodWithIllegalPrice() {
        assertThrows(IllegalArgumentException.class, () -> new Product(0, "testProd0", 0));
        assertThrows(IllegalArgumentException.class, () -> new Product(0, "testProd0", -5));
        assertThrows(IllegalArgumentException.class, () -> prod.setPrice(0));
        assertThrows(IllegalArgumentException.class, () -> prod.setPrice(-5));
    }
}
