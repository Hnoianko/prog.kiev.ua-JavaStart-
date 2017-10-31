package com.gmail.gnoianko;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l;
        int h;

        System.out.println("Input length");
        l = sc.nextInt();
        System.out.println("Input height");
        h = sc.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= l; j++) {
                if (j == 1 || j == l || i == 1 || i == h) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}

