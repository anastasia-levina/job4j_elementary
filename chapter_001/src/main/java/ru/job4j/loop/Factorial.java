package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int y = 1; y <= n; y++) {
            result = result * y;
        }
        return result;
    }
}
