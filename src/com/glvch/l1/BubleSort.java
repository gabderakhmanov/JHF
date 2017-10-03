package com.glvch.l1;

import java.util.Arrays;

public class BubleSort {

    public static void main(String[] args) {

        int[] arr = {2, 3, 0, 14, 700, 500, 321, 10002, 9};

        // DESC pyramid for
        for (int barrier=arr.length-1; barrier>=0; barrier--){
            for (int index=0; index<barrier;index++){

                if (arr[index]>arr[index+1]){

                    // swap idiom (ok for enterprise)
                    int tmp = arr[index];
                    arr[index] = arr[index+1];
                    arr[index+1] = tmp;
                }

            }
        }

        System.out.println(Arrays.toString(arr));


    }

}
