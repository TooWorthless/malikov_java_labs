package com.university.lab2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.university.lab2.items.Book;


public class BookTest {

    @Test
    void testIncorrectTitle() {
        assertThrows(IllegalArgumentException.class, () -> new Book("", "6", "Author"));
    }

    @Test
    void testIncorrectId() {
        assertThrows(IllegalArgumentException.class, () -> new Book("", "", "Author"));
    }

    @Test
    void testIncorrectAuthor() {
        Book correctBook = new Book("BookTitle", "2", "BookAuthor");
        assertThrows(IllegalArgumentException.class, () -> new Book("Title", "3", ""));
    }

    @Test 
    void testBorrow() {
        assertFalse( (new Book("Title", "5", "Author")).getIsBorrowed() );
    }
}