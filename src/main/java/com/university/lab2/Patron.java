package com.university.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.university.lab2.item.Item;


public class Patron {
    private String name;
    private String ID;
    private List<Item> borrowedItems;


    public Patron(String name) {
        this.name = name;
        this.ID = UUID.randomUUID().toString();
        this.borrowedItems = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        if(name.length() <= 0) {
            throw new IllegalArgumentException("Incorrect name!");
        }
        this.name = name;
    }

    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public List<Item> getBorrowedItems() {
        return this.borrowedItems;
    }
    public void setBorrowedItems(List<Item> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }


    public void borrow(Item item) {
        borrowedItems.add(item);
        item.borrowItem();
    }

    public void returnItem(Item item) {
        boolean isRemoved = borrowedItems.remove(item);

        if (!isRemoved) {
            throw new RuntimeException("Item removing error!");
        }
        item.returnItem();
    }
}
