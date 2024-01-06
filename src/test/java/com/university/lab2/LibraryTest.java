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
        this.book = new Book("BookTtile", "3", "BookAuthor");
        this.patron = new Patron("PatronName", "1");
    }

    @Test
    void testAddItem() {
        this.library.addItem(this.book);
        assertEquals(this.library.getItems().get(0), this.book);
    }

    @Test
    void testRemoveItem() {
        this.library.addItem(this.book);
        this.library.removeItem(this.book);
        assertTrue(this.library.getItems().isEmpty());
    }

    @Test
    void testRegPatron() {
        this.library.registerPatron(this.patron);
        assertEquals(this.library.getPatrons().get(0), this.patron);
    }

    @Test
    void testLendItem() {
        this.library.addItem(this.book);
        this.library.registerPatron(this.patron);
        this.library.lendItem(this.patron, this.book);
        assertEquals(this.library.listBorrowed().get(0), this.book);
        assertTrue(this.library.getItems().get(0).getIsBorrowed());
    }

    @Test
    void testLendIncorrectItem() {
        this.library.registerPatron(patron);
        assertThrows(RuntimeException.class, () -> this.library.lendItem(this.patron, this.book));
    }

    @Test
    void testLendItemToIncorrectPatron() {
        this.library.addItem(this.book);
        assertThrows(RuntimeException.class, () -> this.library.lendItem(this.patron, this.book));
    }

    @Test
    void testLendSameItem() {
        this.library.addItem(this.book);
        this.library.registerPatron(this.patron);
        this.library.lendItem(this.patron, this.book);
        assertThrows(RuntimeException.class, () -> this.library.lendItem(this.patron, this.book));
    }

    @Test
    void testReturnItem() {
        this.library.addItem(this.book);
        this.library.registerPatron(this.patron);
        this.library.lendItem(this.patron, this.book);
        this.library.returnItem(this.patron, this.book);
        assertFalse(this.library.getItems().get(0).getIsBorrowed());
    }

    @Test
    void testReturnIncorrectItem() {
        this.library.registerPatron(this.patron);
        assertThrows(RuntimeException.class, () -> this.library.returnItem(this.patron, this.book));
    }

    @Test
    void testReturnItemToIncorrectPatron() {
        this.library.addItem(this.book);
        assertThrows(RuntimeException.class, () -> this.library.returnItem(this.patron, this.book));
    }

    @Test
    void testReturnSameItem() {
        this.library.addItem(this.book);
        this.library.registerPatron(this.patron);
        this.library.lendItem(this.patron, this.book);
        this.library.returnItem(this.patron, this.book);
        assertThrows(RuntimeException.class, () -> this.library.returnItem(this.patron, this.book));
    }
}
