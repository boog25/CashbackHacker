package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackTest {
    @Test
    public void shouldCountHowMuchToAdd100() {
        Cashback service = new Cashback();
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountHowMuchToAdd999() {
        Cashback service = new Cashback();
        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountHowMuchToAdd0() {
        Cashback service = new Cashback();
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountHowMuchToAddZero() {
        Cashback service = new Cashback();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }
}