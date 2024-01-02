package com.university.lab2;

import java.util.ArrayList;
import java.util.List;

import com.university.lab2.interfaces.IManageable;
import com.university.lab2.item.Item;


public class Library implements IManageable {
    private ArrayList<Item> items;
    private ArrayList<Patron> patrons;


    public Library() {
        this.items = new ArrayList<Item>();
        this.patrons = new ArrayList<Patron>();
    }


    public List<Item> getItems() {
        return items;
    }
    public List<Patron> getPatrons() {
        return patrons;
    }


    public void regPatron(Patron patron) {
        patrons.add(patron);
    }


    public void lendItem(Patron patron, Item item) {
        if (!items.contains(item)) {
            throw new RuntimeException("Item not present in the lib!");
        }
        if (!patrons.contains(patron)) {
            throw new RuntimeException("Patron not present!");
        }
        if (item.borrowStatus()) {
            throw new RuntimeException("Item already borrowed!");
        }
        patron.borrow(item);
    }
    public void returnItem(Patron patron, Item item) {
        if (!items.contains(item)) {
            throw new RuntimeException("Item not present in the lib!");
        }
        if (!patrons.contains(patron)) {
            throw new RuntimeException("Patron not present!");
        }
        if (!item.borrowStatus()) {
            throw new RuntimeException("Item wasn't borrowed!");
        }
        patron.returnItem(item);
    }


    @Override
    public void add(Item item) {
        items.add(item);
    }
    @Override
    public void remove(Item item) {
        items.remove(item);
    }


    @Override
    public void listAvailable() {
        for(Item item : items) {
            if(!item.borrowStatus()) {
                System.out.println(item);
            }
        }
    }
    @Override
    public void listBorrowed() {
        for(Item item : items) {
            if(item.borrowStatus()) {
                System.out.println(item);
            }
        }
    }
}
