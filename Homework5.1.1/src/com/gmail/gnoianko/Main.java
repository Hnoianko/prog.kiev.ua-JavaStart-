package com.gmail.gnoianko;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int[] a = {0, 5, 2, 4, 7, 1, 3, 19};
        for (int i = 0; i < a.length; i++) {
            if ((a[i] % 2 != 0) && (a[i] != 0)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
