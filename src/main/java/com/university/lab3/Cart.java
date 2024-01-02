package com.university.lab3;

import java.util.ArrayList;
import java.util.Arrays;

public class Cart {
    private ArrayList<Product> prods;


    public Cart() {
        this.prods = new ArrayList<>();
    }

    
    public ArrayList<Product> getProds() {
        return prods;
    }

    public void setProds(ArrayList<Product> prods) {
        this.prods = prods;
    }

    public void addProd(Product... prods)
    {
        this.prods.addAll(Arrays.asList(prods));
    }

    public void delProd(Product product)
    {
        boolean result = prods.remove(product);
        if (!result) throw new RuntimeException("Product not present in a cart");
    }
}
