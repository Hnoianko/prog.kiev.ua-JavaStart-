package com.gmail.gnoianko;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(findNumber(arr,6));

    }
    public static int findNumber(int[]arr,int n){
        int find=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                find=i;
            }
        }
        return find;
    }
}
