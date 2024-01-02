package com.university.lab2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.university.lab2.items.Book;


public class LibraryTest {
    private Book book;
    private Patron patron;
    private Library library;

    @BeforeEach
    void setUp() {
        this.library = new Library();
        this.book = new Book("BookTtile", "BookAuthor");
        this.patron = new Patron("PatronName");
    }

    @Test
    void testAddItem() {
        this.library.add(this.book);
        assertEquals(this.library.getItems().get(0), this.book);
    }

    @Test
    void testRemoveItem() {
        this.library.add(this.book);
        this.library.remove(this.book);
        assertTrue(this.library.getItems().isEmpty());
    }

    @Test
    void testRegPatron() {
        this.library.regPatron(this.patron);
        assertEquals(this.library.getPatrons().get(0), this.patron);
    }

    @Test
    void testLendItem() {
        this.library.add(this.book);
        this.library.regPatron(this.patron);
        this.library.lendItem(this.patron, this.book);
        assertEquals(this.patron.getBorrowedItems().get(0), this.book);
        assertTrue(this.library.getItems().get(0).borrowStatus());
    }

    @Test
    void testLendIncorrectItem() {
        this.library.regPatron(patron);
        assertThrows(RuntimeException.class, () -> this.library.lendItem(this.patron, this.book));
    }

    @Test
    void testLendItemToIncorrectPatron() {
        this.library.add(this.book);
        assertThrows(RuntimeException.class, () -> this.library.lendItem(this.patron, this.book));
    }

    @Test
    void testLendSameItem() {
        this.library.add(this.book);
        this.library.regPatron(this.patron);
        this.library.lendItem(this.patron, this.book);
        assertThrows(RuntimeException.class, () -> this.library.lendItem(this.patron, this.book));
    }

    @Test
    void testReturnItem() {
        this.library.add(this.book);
        this.library.regPatron(this.patron);
        this.library.lendItem(this.patron, this.book);
        this.library.returnItem(this.patron, this.book);
        assertFalse(this.library.getItems().get(0).borrowStatus());
    }

    @Test
    void testReturnIncorrectItem() {
        this.library.regPatron(this.patron);
        assertThrows(RuntimeException.class, () -> this.library.returnItem(this.patron, this.book));
    }

    @Test
    void testReturnItemToIncorrectPatron() {
        this.library.add(this.book);
        assertThrows(RuntimeException.class, () -> this.library.returnItem(this.patron, this.book));
    }

    @Test
    void testReturnSameItem() {
        this.library.add(this.book);
        this.library.regPatron(this.patron);
        this.library.lendItem(this.patron, this.book);
        this.library.returnItem(this.patron, this.book);
        assertThrows(RuntimeException.class, () -> this.library.returnItem(this.patron, this.book));
    }
}
