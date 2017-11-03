package com.gmail.gnoianko;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[15];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 11);
        }
        int[] b = Arrays.copyOf(a, 30);

        for (int j = 0; j < a.length; j++) {
            b[j + 15] = a[j] * 2;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}




