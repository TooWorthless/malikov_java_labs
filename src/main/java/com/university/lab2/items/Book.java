package com.university.lab2.items;

import com.university.lab2.item.Item;

public class Book extends Item {
    private String _author;

    public Book(String title, String uniqueId, String author) {
        super(title, uniqueId);

        if(title.length() <= 0) {
            throw new IllegalArgumentException("Incorrect title name!");
        }
        if(author.length() <= 0) {
            throw new IllegalArgumentException("Incorrect author name!");
        }
        if(uniqueId.length() <= 0) {
            throw new IllegalArgumentException("Incorrect uniqueId name!");
        }
        this._author = author;
    }

    public String get_author() {
        return _author;
    }

    @Override
    public void borrowItem() {
        setIsBorrowed(true);
    }

    @Override
    public void returnItem() {
        setIsBorrowed(false);
    }
}
