package ru.netology.stats.Services;


import java.util.stream.IntStream;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    long sumSales(long[] sales) {
        long sum = 0;
        for (long i : sales) {
            sum += i;
        }
        return (int) sum;
    }

    public long averageSales(long[] sales) {
        long sum = sumSales(sales);
        return sum / sales.length;
    }

    public int salesBelowAverage(long[] sales) {
        int numberOfMonths = 0;
        long average = averageSales(sales);
        for (long sale : sales) {
            if (average > sale) {
                numberOfMonths++;
            }
        }

        return numberOfMonths;
    }

    public int salesHigherAverage(long[] sales) {
        int numberOfMonths = 0;
        long average = averageSales(sales);
        for (long sale : sales) {
            if (average < sale) {
                numberOfMonths++;
            }
        }

        return numberOfMonths;
    }
}




