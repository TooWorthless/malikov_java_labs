package com.university.lab2.items;

import com.university.lab2.item.Item;


public class DVD extends Item {
    private int duration;

    
    public DVD(String title, int duration) {
        super(title);

        if (duration <= 0) {
            throw new IllegalArgumentException("Incorrect duration value!");
        }
        this.duration = duration;
    }


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration <= 0) {
            throw new IllegalArgumentException("Incorrect duration value!");
        }
        this.duration = duration;
    }


    @Override
    public void borrowItem() {
        if(this.isBorrowed) {
            throw new RuntimeException("This DVD is borrowed!");
        }
        System.out.println("DVD borrowed: " + this.title + " - (ID: " + this.uniqueID + ")");
        this.isBorrowed = true;
    }

    @Override
    public void returnItem() {
        if(!this.isBorrowed) {
            throw new RuntimeException("This DVD is unborrowed!");
        }
        System.out.println("DVD unborrowed: " + this.title + " - (ID: " + this.uniqueID + ")");
        this.isBorrowed = false;
    }


    @Override
    public String toString() {
        return "DVD info:\n{\n   Title: " + this.title + "\n   Duration: " + this.duration + "\n}\n";
    }
}
