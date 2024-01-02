package com.university.lab7.comparators;

import java.util.Comparator;

import com.university.lab7.Product;

public class ProductStockComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Integer.compare(p1.getStock(), p2.getStock());
    }
}
