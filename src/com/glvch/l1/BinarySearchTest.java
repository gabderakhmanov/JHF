package com.glvch.l1;

import java.util.Arrays;

public class BinarySearchTest {

    public static void main(String[] args) {

        int[] arr = {2, 3, 14, 700, 900, 3321, 10002};

        System.out.println(Arrays.binarySearch(arr, 2));
        System.out.println(Arrays.binarySearch(arr, 1));
        System.out.println(Arrays.binarySearch(arr, 10000000));
        System.out.println(Arrays.binarySearch(arr, 0));

        // output
        // 0
        // -1
        // -8
        // -1

    }

}
