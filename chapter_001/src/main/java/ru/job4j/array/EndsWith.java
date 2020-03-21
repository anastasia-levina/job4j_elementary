package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int lengthDifference = word.length - post.length;
        for (int index = word.length - 1; index >= lengthDifference; index--) {
            if (word[index] != post[index - lengthDifference]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
