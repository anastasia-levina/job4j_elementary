package ru.job4j.sort;

import ru.job4j.array.FindLoop;
import ru.job4j.array.MinDiapason;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexLeft = 0, indexRsl = 0, indexRight = 0;
        while (indexLeft < left.length || indexRight < right.length) {
            if (indexLeft == left.length) {
                rsl[indexRsl] = right[indexRight];
                indexRsl++;
                indexRight++;
            } else if (indexRight == right.length) {
                rsl[indexRsl] = left[indexLeft];
                indexRsl++;
                indexLeft++;
            } else if (left[indexLeft] < right[indexRight]) {
                rsl[indexRsl] = left[indexLeft];
                indexRsl++;
                indexLeft++;
            } else if (left[indexLeft] > right[indexRight]) {
                rsl[indexRsl] = right[indexRight];
                indexRsl++;
                indexRight++;
            } else if (left[indexLeft] == right[indexRight]) {
                rsl[indexRsl] = left[indexLeft];
                indexLeft++;
                indexRsl++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}