package com.university.lab2;

import com.university.lab2.items.Book;
import com.university.lab2.items.DVD;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        Book book1 = new Book("BookName1", "BookAuthorName1");
        Book book2 = new Book("BookName2", "BookAuthorName2");
        Book book3 = new Book("BookName3", "BookAuthorName3");

        lib.add(book1);
        lib.add(book2);
        lib.add(book3);

        lib.listAvailable();
        // Book info:
        // {
        //    Title: BookName1       
        //    Author: BookAuthorName1
        // }
        // 
        // Book info:
        // {
        //    Title: BookName2       
        //    Author: BookAuthorName2
        // }
        // 
        // Book info:
        // {
        //    Title: BookName3       
        //    Author: BookAuthorName3
        // }

        lib.remove(book2);
        lib.remove(book3);

        lib.listAvailable();
        // Book info:
        // {
        //    Title: BookName1       
        //    Author: BookAuthorName1
        // }
        // 

        DVD dvd1 = new DVD("DVD_Name1", 10);
        DVD dvd2 = new DVD("DVD_Name2", 20);

        lib.add(dvd1);
        lib.add(dvd2);

        lib.listAvailable();
        // Book info:
        // {
        //    Title: BookName1
        //    Author: BookAuthorName1
        // }
        // 
        // DVD info:
        // {
        //    Title: DVD_Name1
        //    Duration: 10
        // }
        // 
        // DVD info:
        // {
        //    Title: DVD_Name2
        //    Duration: 20
        // }

        Patron p1 = new Patron("Vadym");
        Patron p2 = new Patron("Mykyta");
        Patron p3 = new Patron("Vladislav");

        lib.regPatron(p1);
        lib.regPatron(p2);
        lib.regPatron(p3);

        lib.lendItem(p1, book1);
        // Book borrowed: BookName1 (Author: BookAuthorName1) - (ID: .....)
        lib.lendItem(p2, dvd1);
        // DVD borrowed: DVD_Name1 - (ID: .....)

        lib.returnItem(p2, dvd1);
        // DVD unborrowed: DVD_Name1 - (ID: .....)
    }
}