package com.hsbc.arrays;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int size = 2;
        int [] arr [] = new int[size][];
        arr[0] = new int[5];
        arr[1] = new int[2];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<arr.length; i++){
            System.out.println("Enter "+arr[i].length+" numbers.");
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Contains of array: ");
        for (int a[] : arr){
            for(int val : a){
                System.out.print(val+" ");
            }
            System.out.println();
        }

    }
}
