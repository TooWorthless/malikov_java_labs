package com.university.lab2.interfaces;

import com.university.lab2.item.Item;

import java.util.List;

public interface IManageable {
    void addItem(Item item);

    void removeItem(Item item);

    List<Item> listAvailable();

    List<Item> listBorrowed();
}
