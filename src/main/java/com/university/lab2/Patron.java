package com.university.lab2;

import java.util.ArrayList;
import java.util.List;

import com.university.lab2.item.Item;

public class Patron {
    private String _name;
    private String ID;
    private List<Item> _borrowedItems;
    public Patron(String name, String ID){
        this._name = name;
        this.ID = ID;
        this._borrowedItems = new ArrayList<>();
    }
    public String get_name(){
        return _name;
    }
    public String getID(){
        return ID;
    }
    public List<Item> get_borrowedItems(){
        return _borrowedItems;
    }
    public void borrowItem(Item item){
        _borrowedItems.add(item);
    }
    public boolean returnItem(Item item){

        boolean isRemoved = _borrowedItems.remove(item);

        if (!isRemoved) {
            throw new RuntimeException("Item removing error!");
        }
        
        return isRemoved;
    }
}