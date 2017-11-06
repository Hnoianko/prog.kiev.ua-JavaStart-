package com.gmail.gnoianko;

public class Main {
    public static void main(String[] args) {
        String text = "My name is Bohdan";

        System.out.println(countResult(text));

    }

    public static int countResult(String text) {
        int count = 0;
        String[] t = text.split("[ ]");
        for (int i = 0; i < t.length; i++) {
            count++;
        }
        return count;
    }
}
