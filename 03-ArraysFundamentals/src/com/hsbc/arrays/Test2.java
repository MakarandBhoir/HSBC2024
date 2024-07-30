package com.hsbc.arrays;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int arr [][][] = new int[2][][];
        arr[0] = new int[2][];
        arr[0][0] = new int [4];
        arr[0][1] = new int[3];

        arr[1] = new int[2][];
        arr[1][0] = new int[2];
        arr[1][1] = new int[1];

        arr[0][0][0] = 10;
        arr[0][0][1] = 7;
        arr[0][0][2] = 18;
        arr[0][0][3] = 24;

        arr[0][1][0] = 2;
        arr[0][1][1] = 14;
        arr[0][1][2] = 19;

        arr[1][0][0] = 76;
        arr[1][0][1] = 43;

        arr[1][1][0] = 17;

        for(int a2[][] : arr) {
            for (int a1[] : a2) {
                System.out.println(Arrays.toString(a1));
            }
        }
    }
}
