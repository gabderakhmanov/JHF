package com.glvch.l1;

import java.util.Arrays;

public class ArrayInversion {

    public static void main(String[] args) {

        int[] arr = {2, 3, 0, 14, 700, 500, 321, 10002, 9};

        System.out.println("Before: "+Arrays.toString(arr));

        for (int i = 0; i<arr.length/2; i++){
            int tmp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = tmp;
        }

        System.out.println("After: "+Arrays.toString(arr));

    }

}
