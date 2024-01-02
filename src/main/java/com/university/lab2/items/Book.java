package com.university.lab2.items;

import com.university.lab2.item.Item;


public class Book extends Item {
    private String author;

    
    public Book(String title, String author) {
        super(title);

        if(author.length() <= 0) {
            throw new IllegalArgumentException("Incorrect author name!");
        }
        this.author = author;
    }


    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        if (author.length() == 0) {
            throw new IllegalArgumentException("Incorrect author field value!");
        }
        this.author = author;
    }


    @Override
    public void borrowItem() {
        if(this.isBorrowed) {
            throw new RuntimeException("This book is borrowed!");
        }
        System.out.println("Book borrowed: " + this.title + " (Author: " + this.author + ") " + "- (ID: " + this.uniqueID + ")");
        this.isBorrowed = true;
    }

    @Override
    public void returnItem() {
        if(!this.isBorrowed) {
            throw new RuntimeException("This book is unborrowed!");
        }
        System.out.println("Book unborrowed: " + this.title + " (Author: " + this.author + ") " + "- (ID: " + this.uniqueID + ")");
        this.isBorrowed = false;
    }


    @Override
    public String toString() {
        return "Book info:\n{\n   Title: " + this.title + "\n   Author: " + this.author + "\n}\n";
    }
}
