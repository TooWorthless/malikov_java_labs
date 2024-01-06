package com.university.lab2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import com.university.lab2.item.Item;
import com.university.lab2.items.Book;


public class PatronTest {

    private Book book;
    private Patron patron;

    @BeforeEach
    void setUp() {
        this.book = new Book("BookTtile", "1", "BookAuthor");
        this.patron = new Patron("PatronName", "1");
    }

    @Test
    void testBorrow() {
        this.patron.borrowItem(this.book);
        List<Item> testItemsList = this.patron.get_borrowedItems();
        assertEquals(testItemsList.get(0), this.book);
    }

    @Test
    void testReturnItem() {
        this.patron.borrowItem(this.book);
        this.patron.returnItem(this.book);
        assertTrue(this.patron.get_borrowedItems().isEmpty());
    }

    @Test
    void testReturnIncorrectItem() {
        assertThrows(RuntimeException.class, () -> this.patron.returnItem(this.book));
    }

    
}
