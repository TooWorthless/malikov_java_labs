package com.university.lab4_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.university.lab4_1.Main;

public class IsPalindromeTest {
    @Test

    void testIsPalindrome() {
        assertTrue(Main.IsPalindrome("Never odd or even"));
        assertTrue(Main.IsPalindrome("Vadym myDaV"));
        assertTrue(Main.IsPalindrome(""));
        assertTrue(Main.IsPalindrome("  "));

        assertFalse(Main.IsPalindrome("privet"));
    }
}
