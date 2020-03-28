package ru.job4j.sort;

import ru.job4j.array.FindLoop;
import ru.job4j.array.MinDiapason;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexLeft = 0, indexRsl = 0, indexRight = 0;
        while (indexLeft < left.length) {
            rsl[indexRsl] = left[indexLeft];
            indexRsl++;
            indexLeft++;
        }
        while (indexRight < right.length) {
            rsl[indexRsl] = right[indexRight];
            indexRsl++;
            indexRight++;
        }
        indexRsl = 0;
        while (indexRsl < rsl.length - 1) {
            int min = MinDiapason.findMin(rsl, indexRsl, rsl.length - 1);
            int indexOfMin = FindLoop.indexOf(rsl, min, indexRsl, rsl.length - 1);
            if (rsl[indexRsl] > min) {
                int temp = rsl[indexRsl];
                rsl[indexRsl] = min;
                rsl[indexOfMin] = temp;
            }
            indexRsl++;
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