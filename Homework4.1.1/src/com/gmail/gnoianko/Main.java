package com.gmail.gnoianko;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b;


        System.out.println("Input number of strips");
        b = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j += 1) {
                if (j % 2 == 0) {
                    System.out.print("+++");
                } else {
                    System.out.print("***");
                }

            }
            System.out.println();
        }
        sc.close();
    }
}