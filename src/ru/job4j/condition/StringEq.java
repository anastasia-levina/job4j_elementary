package ru.job4j.condition;

public class StringEq {
    public static boolean check(String login) {
        String root = "root";
        return login.equals(root);
    }

    public static void main(String[] args) {
        String your = "root";
        boolean userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);
    }
}
