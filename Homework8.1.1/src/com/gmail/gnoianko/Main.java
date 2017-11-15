package com.gmail.gnoianko;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File fileA = new File("a.txt");
        try {
            fileA.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = getStringFromCons();
        saveStringToFile(text, fileA);
        System.out.println("The text was saved to a file!");
    }

    public static String getStringFromCons() {
        String t = "";
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input text");
            t = sc.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    public static void saveStringToFile(String text, File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
