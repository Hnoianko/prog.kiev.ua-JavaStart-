package com.gmail.gnoianko;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 25);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(maxNumber(arr));

    }

    public static int maxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
