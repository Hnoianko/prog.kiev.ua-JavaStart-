package com.gmail.gnoianko;

import java.util.Scanner;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int count = 0;
        String a;
        System.out.println("Input word");
        a = sc.nextLine();
        char[] t = a.toCharArray();
        System.out.println(Arrays.toString(t));
        for (int i = 0; i < t.length; i++) {
            if (t[i] == 'b') {
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }
}
