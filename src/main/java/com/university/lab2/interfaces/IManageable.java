package com.university.lab2.interfaces;

import com.university.lab2.item.Item;


public interface IManageable {
    void add(Item item);
    void remove(Item item);
    void listAvailable();
    void listBorrowed();
}
