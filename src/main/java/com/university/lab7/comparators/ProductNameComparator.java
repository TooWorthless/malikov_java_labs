package com.university.lab7.comparators;

import java.util.Comparator;

import com.university.lab7.Product;

public class ProductNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
}