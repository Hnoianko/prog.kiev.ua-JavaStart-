package com.gmail.gnoianko;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int fact = 1;
        System.out.println("Input digit from 5 to 15");
        a = sc.nextInt();
        if ((a > 4) & (a < 16)) {
            for (int i = 1; i <= a; i++) {
                fact = fact * i;
            }
            System.out.println(a + "!=" + fact);
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
