package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {

    @Test
    public void purchaseAmountAboveBoundary() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(actual, expected);
    }

@Test
    public void purchaseAmountBelowBoundary() {
        CashbackHacker service = new CashbackHacker();
        int amount = 200;
        int actual = service.remain(amount);
        int expected = 800;
        assertEquals(actual, expected);
    }

    @Test
    public void purchaseAmountEqualToBoundary() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void purchaseAmountEqualToZero() {
        CashbackHacker service = new CashbackHacker();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void purchaseAmountIsLarge() {
        CashbackHacker service = new CashbackHacker();
        int amount = 999999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }
}