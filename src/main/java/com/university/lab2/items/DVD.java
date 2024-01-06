package com.university.lab2.items;

import com.university.lab2.item.Item;

public class DVD extends Item {
    private int _duration;

    public DVD(String title, String uniqueId, int duration) {
        super(title, uniqueId);

        if(title.length() <= 0) {
            throw new IllegalArgumentException("Incorrect title name!");
        }
        if(duration <= 0) {
            throw new IllegalArgumentException("Incorrect duration!");
        }
        if(uniqueId.length() <= 0) {
            throw new IllegalArgumentException("Incorrect uniqueId name!");
        }

        this._duration = duration;
    }

    public int get_duration() {
        return _duration;
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