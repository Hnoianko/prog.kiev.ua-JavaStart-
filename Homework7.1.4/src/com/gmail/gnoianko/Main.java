package com.gmail.gnoianko;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        print();

    }

    public static void print() {
        double pi = Math.PI;
        Formatter form = new Formatter();
        for (int i = 0; i < 10; i++) {
            String h = "%." + (i + 2) + "f";
            form.format(h, pi);
            String text = form.toString();
            System.out.println(text);
            form = new Formatter();
        }
    }
}