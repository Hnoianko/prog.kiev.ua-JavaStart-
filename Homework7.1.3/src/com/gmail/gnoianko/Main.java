package com.gmail.gnoianko;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input binary number:");
        String bin = sc.nextLine();
        toDec(bin);
        sc.close();
    }

    static void toDec(String bin) {
        char[] a = bin.toCharArray();
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '1') {
                t = (int) (t + (1 * Math.pow(2, a.length - 1 - i)));
            } else if (a[i] != '0') {
                System.out.println("Incorrect input");
              return;
            }
        }
        System.out.println("\"" + bin + "\" -> " + t);
    }

}