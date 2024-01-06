package com.university.lab2;

import java.util.ArrayList;
import java.util.List;

import com.university.lab2.interfaces.IManageable;
import com.university.lab2.item.Item;

public class Library implements IManageable{
    private List<Item> _items;
    private List<Patron> _patrons;
    public Library(){
        this._items = new ArrayList<>();
        this._patrons = new ArrayList<>();
    }
    public List<Patron> getPatrons(){
        return _patrons;
    }
    public void registerPatron(Patron patron){
        _patrons.add(patron);
    }
    public void lendItem(Patron patron, Item item){
        if (!_items.contains(item)) throw new RuntimeException("Attempt to borrow an item not present in the library");
        if (!_patrons.contains(patron)) throw new RuntimeException("Attempt to borrow an item from a non-registered patron");
        if (item.getIsBorrowed()) throw new RuntimeException("Attempt to borrow a borrowed item");

        patron.borrowItem(item);
        item.borrowItem();
    }
    public void returnItem(Patron patron, Item item){
        if(patron.get_borrowedItems().contains(item)){
            patron.returnItem(item);
            item.returnItem();
        }
        else {
            throw new IllegalArgumentException("Incorrect returnItem!");
        }
    }
    @Override
    public void addItem(Item item){
        _items.add(item);
    }
    @Override
    public void removeItem(Item item){
        _items.remove(item);
    }
    @Override
    public List<Item> listAvailable(){
       List<Item> available = new ArrayList<>();
        for(Item item : _items){
            if(!item.getIsBorrowed()){
                available.add(item);
            }
        }
        return available;
    }
    @Override
    public List<Item> listBorrowed(){
        List<Item> borrowed = new ArrayList<>();
        for(Patron patron : _patrons){
            borrowed.addAll(patron.get_borrowedItems());
        }
        return borrowed;
    }

    public List<Item> getItems(){
        return this._items;
    }
}