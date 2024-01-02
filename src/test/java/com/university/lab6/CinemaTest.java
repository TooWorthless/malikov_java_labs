package com.university.lab6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CinemaTest {
    private Cinema cinema;

    @BeforeEach
    void setUp() {
        cinema = new Cinema(5, 10, 20);
    }


    @Test
    void testCinemaSeatsInit() {
        cinema.initializeSeats();
    }

    @Test
    void testBookSeats() {
        cinema.initializeSeats();

        cinema.bookSeats(1, 1, new int[]{1, 2});

        assertEquals(1, cinema.getSeatingArrangement()[1][1][1]);
        assertEquals(1, cinema.getSeatingArrangement()[1][1][2]);
    }

    @Test
    void testBookBookingSeats() {
        cinema.initializeSeats();

        assertTrue(cinema.bookSeats(1, 3, new int[]{4, 5, 6}));
        assertFalse(cinema.bookSeats(1, 3, new int[]{5, 6}));
    }

    @Test
    void testCancelBooking() {
        cinema.initializeSeats();

        cinema.bookSeats(1, 3, new int[]{4, 5, 6});
        cinema.bookSeats(1, 3, new int[]{5, 6});

        assertTrue(cinema.cancelBooking(1, 3, new int[]{5, 6}));
        assertFalse(cinema.cancelBooking(1, 4, new int[]{1, 2, 3}));
    }

    @Test
    void testPrintSeatingArrangement() {
        cinema.initializeSeats();

        cinema.bookSeats(1, 3, new int[]{4, 5, 6});
        cinema.bookSeats(1, 3, new int[]{5, 6});

        cinema.printSeatingArrangement(1);
    }
}
