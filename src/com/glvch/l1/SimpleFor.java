package com.glvch.l1;

public class SimpleFor {

    public static void main(String[] args) {

        for (int k =0; k < 10; k++){
            System.out.print(k + " ");
        }

        System.out.println(" ");
        for (int k=0; k<10; k+=2){
            System.out.print(k+" ");
        }

        System.out.println(" ");
        for (int k=9; k>0; k--){
            System.out.print(k+" ");
        }

        System.out.println(" ");
        for (int k=9; k>0; k-=2){
            System.out.print(k+" ");
        }

        System.out.println(" ");
        int[] arr = {10,20,30,40,50,60,70,80,90};
        for (int k=0; k<arr.length; k++){
            System.out.print(arr[k]+ " ");
        }

        // bad practice to change the counter inside for
//        System.out.println(" ");
//        for (int k=0; k<10; k++ ){
//            System.out.println(k + " ");
//            k--;
//        }


    }

}
