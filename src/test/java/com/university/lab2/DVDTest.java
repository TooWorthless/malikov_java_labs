package com.university.lab2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.university.lab2.items.DVD;


public class DVDTest {

    @Test
    void testIncorrectTitle() {
        assertThrows(IllegalArgumentException.class, () -> new DVD("", 10));
    }

    @Test
    void testIncorrectDuration() {
        DVD correctBook = new DVD("DVDTitle", 60);
        assertThrows(IllegalArgumentException.class, () -> new DVD("Title", 0));
        assertThrows(IllegalArgumentException.class, () -> correctBook.setDuration(0));
    }

    @Test 
    void testBorrow() {
        assertFalse( (new DVD("Title", 120)).borrowStatus() );
    }
}
