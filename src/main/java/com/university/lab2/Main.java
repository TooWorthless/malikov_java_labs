package com.university.lab2;

import com.university.lab2.items.Book;
import com.university.lab2.items.DVD;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        Book book1 = new Book("BookName1", "1", "BookAuthorName1");
        Book book2 = new Book("BookName2", "2", "BookAuthorName2");
        Book book3 = new Book("BookName3", "2", "BookAuthorName3");

        lib.addItem(book1);
        lib.addItem(book2);
        lib.addItem(book3);

        lib.listAvailable();

        lib.removeItem(book2);
        lib.removeItem(book3);

        lib.listAvailable();

        DVD dvd1 = new DVD("DVD_Name1", "1", 10);
        DVD dvd2 = new DVD("DVD_Name2", "2", 20);

        lib.addItem(dvd1);
        lib.addItem(dvd2);

        lib.listAvailable();

        Patron p1 = new Patron("Vadym", "1");
        Patron p2 = new Patron("Mykyta", "2");
        Patron p3 = new Patron("Vladislav", "3");

        lib.registerPatron(p1);
        lib.registerPatron(p2);
        lib.registerPatron(p3);

        lib.lendItem(p1, book1);

        lib.lendItem(p2, dvd1);

        lib.returnItem(p2, dvd1);
    }
}