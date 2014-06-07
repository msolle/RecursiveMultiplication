package com.gmail.sollematthew.recursivemultiplication;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Matt
 */
public class RecMultTest {

    RecMult r;

    public RecMultTest() {
    }

    @Before
    public void initialize() {
        r = new RecMult();
    }

    @Test
    public void RecMultBothZeros() {
        System.out.println("0 x 0");
        int x = 0;
        int y = 0;
        int expected = 0;
        int result = r.recMult(x, y);
        assertEquals(result, expected);
    }

    @Test
    public void RecMultMultiplicandZero() {
        System.out.println("0 x 15");
        int x = 0;
        int y = 15;
        int expected = 0;
        int result = r.recMult(x, y);
        assertEquals(result, expected);
    }

    @Test
    public void RecMultMultiplierZero() {
        System.out.println("15 x 0");
        int x = 15;
        int y = 0;
        int expected = 0;
        int result = r.recMult(x, y);
        assertEquals(result, expected);
    }

    @Test
    public void RecMultSmallNumbers() {
        System.out.println("4 x 4");
        int x = 4;
        int y = 4;
        int expected = 16;
        int result = r.recMult(x, y);
        assertEquals(result, expected);
    }

    @Test
    public void RecMultLargeNumbers() {
        System.out.println("15486 x 5118");
        int x = 15486;
        int y = 5118;
        int expected = 79257348;
        int result = r.recMult(x, y);
        assertEquals(result, expected);
    }
    
    @Test
    public void RecMultSmallLarge() {
        System.out.println("3 x 5118");
        int x = 3;
        int y = 5118;
        int expected = 15354;
        int result = r.recMult(x, y);
        assertEquals(result, expected);
    }
    
    @Test
    public void RecMultLargeSmall() {
        System.out.println("4000 x 10");
        int x = 4000;
        int y = 10;
        int expected = 40000;
        int result = r.recMult(x, y);
        assertEquals(result, expected);
    }
}
