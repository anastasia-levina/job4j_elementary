package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int index, index2, arr = 1;
        for (index = 0; index < array.length; index++) {
            for (index2 = 0; index2 < array[index].length; index2++) {
                array[index][index2] = arr;
                arr++;
            }
        }
        for (index = 0; index < array.length; index++) {
            for (index2 = 0; index2 < array[index].length; index2++) {
                System.out.print(array[index][index2] + " ");
            }
            System.out.println();
        }
    }
}

