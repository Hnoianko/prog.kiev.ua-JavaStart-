package com.gmail.gnoianko;

public class Main {
    public static void main (String[]args){
        drawRectangle(15, 17, '*');

    }
    public static void drawRectangle(int h, int w, char fill) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {
                    System.out.print(fill);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
