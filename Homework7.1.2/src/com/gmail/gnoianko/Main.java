package com.gmail.gnoianko;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(arrToString(arr));

    }

    public static String arrToString(int[] arr) {
        String a = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                a = a + arr[i];
            } else {
                a = a + arr[i] + ", ";
            }
        }

        return a + "]";
    }
}
