package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {

    @Test
    void shouldCalcSum() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calcSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageSales() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSum() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSum() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSum(sales);
        assertEquals(expected, actual);
    }


    @Test
    void shouldLowerAverage() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.lowerAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldUpperAverage() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.upperAverage(sales);
        assertEquals(expected, actual);
    }
}
