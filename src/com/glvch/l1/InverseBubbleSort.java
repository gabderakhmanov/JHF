package com.glvch.l1;

import java.util.Arrays;

public class InverseBubbleSort {

    public static void main(String[] args) {

        int[] arr = {2, 3, 0, 14, 700, 500, 321, 10002, 9};

        for (int i = arr.length-1; i>=0; i--){
            for (int j = 0; j<i; j++){

                // change direction of the sort
                if (arr[j]<arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(arr));
        // will print: [10002, 700, 500, 321, 14, 9, 3, 2, 0]
    }

}
