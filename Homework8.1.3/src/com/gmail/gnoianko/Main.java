package com.gmail.gnoianko;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        System.out.println(getFoldersInfo("E:\\КУРСИ JAVA\\projects\\Homework8.1.2"));
    }

    public static String getFoldersInfo(String address) {
        StringBuilder name = new StringBuilder();
        File folder = new File(address);
        File[] files = folder.listFiles();
        for (File x : files) {
            if (x.isDirectory()) {
                name.append(x.getName()+System.lineSeparator());
            }
        }
        return name.toString();
    }

}
