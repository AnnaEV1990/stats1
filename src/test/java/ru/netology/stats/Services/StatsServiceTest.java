package ru.netology.stats.Services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class StatsServiceTest {


    @Test

    public void sholduMinSales() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void sholdMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void sumSAles() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = (int) service.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSAles() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = (int) service.averageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void salesBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.salesBelowAverage(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void salesHigherAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.salesHigherAverage(sales);
        Assertions.assertEquals(expected, actual);


    }

}

