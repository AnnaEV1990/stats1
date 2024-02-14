package ru.netology.stats.Services;

public class StatsService {
    private int i;

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

    public int sumSales(long[] sales) {
        long sum = 0;
        for (long i : sales) {
            sum += i;
        }
        return (int) sum;
    }


    public int averageSales(long[] sales) {
        int month = 12;
        long sum = 0;
        for (long i : sales) {
            sum += i;
        }

        return (int) sum / month;
    }

    public int SalesBelowAverage(long[] sales) {
        long sum = 0;
        int Month = 12;
        for (long i : sales) {
            sum += i;
        }
        int average = (int) sum / Month;
        int NumberOfMonths = 0;
        if (sales[i] < average) {
            NumberOfMonths++;
        }
        return NumberOfMonths;
    }


    public int SalesHigherAverage(long[] sales) {
        long sum = 0;
        int Month = 12;
        for (long i : sales) {
            sum += i;
        }
        int average = (int) sum / Month;
        int NumberOfMonths = 0;
        if (sales[i] > average) {
            NumberOfMonths++;
        }
        return NumberOfMonths;
    }
}


