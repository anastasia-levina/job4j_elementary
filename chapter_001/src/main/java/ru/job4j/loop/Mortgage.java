package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        double percentSum = amount * (percent / 100);
        double everyYearSum = amount + percentSum;
        while (salary < everyYearSum) {
            double balance = everyYearSum - salary;
            if (balance > 0) {
                everyYearSum = balance + percentSum;
                year++;
            }
        }
        return year;
    }
}
