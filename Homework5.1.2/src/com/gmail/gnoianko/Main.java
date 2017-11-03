package com.gmail.gnoianko;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Input length");
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Input digit " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        sc.close();
    }

}



