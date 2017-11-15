package com.gmail.gnoianko;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        int[][] arr = new int[][] { { 11111 }, { 22222 }, { 33333 }, { 44444 } };
        File fileA = new File("a.txt");
        try {
            fileA.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        printArr(arr, fileA);

    }

    public static void printArr(int[][] arr, File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    pw.println(arr[i][j]);
                }
                pw.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
