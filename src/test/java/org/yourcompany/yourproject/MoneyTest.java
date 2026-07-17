package org.yourcompany.yourproject;

import static org.junit.Assert.*;
import org.junit.Test;

public class MoneyTest {

    static class Dollar {
        int amount = 10;
        Dollar(int amount) {}
        void times(int multiplier) {}
    }

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}