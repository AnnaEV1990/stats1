package ru.netology.stats.Services;

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

    public int salesBelowAverage(long[] sales) {
        int numberOfMonths = 0;
        long sum = 0;
        int Month = 12;
        for (long i : sales) {
            sum += i;
        }
       long average = (int)sum/Month;
        if (sales.length < average) {
                numberOfMonths++;
            }

        return numberOfMonths;
    }


    public int salesHigherAverage(long[] sales) {
        int numberOfMonths = 0;
        long sum = 0;
        int Month = 12;
        for (long i : sales) {
            sum += i;
        }
        long average = (int)sum/Month;
        if (sales.length > average) {
            numberOfMonths += 1;
        }

        return numberOfMonths;
    }
}


