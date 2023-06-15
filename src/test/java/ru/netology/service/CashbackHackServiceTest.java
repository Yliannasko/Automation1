package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldCashbackLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 600;

        int actual = service.remain(amount);
        int expected = 400;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldCashbackMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1999;

        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);


    }

    @Test
    public void shouldCashbackEqualBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);

    }
}
