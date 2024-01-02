package com.university.lab2.item;

import java.util.UUID;


public abstract class Item {
    protected String title;
    protected String uniqueID;
    protected boolean isBorrowed;


    public Item(String title) {
        if(title.length() <= 0) {
            throw new IllegalArgumentException("Incorrect title value!");
        }
        this.title = title;
        this.uniqueID = UUID.randomUUID().toString();
        this.isBorrowed = false;
    }


    public boolean borrowStatus() {
        return this.isBorrowed;
    }


    public abstract void borrowItem();
    public abstract void returnItem();
}
