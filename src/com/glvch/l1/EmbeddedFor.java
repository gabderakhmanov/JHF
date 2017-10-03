package com.glvch.l1;

public class EmbeddedFor {

    public static void main(String[] args) {

        for (int i=0; i<5; i++){
            for (int y=0; y<5; y++){
                System.out.print(" i="+i+" y="+y);
            }
            System.out.println();
        }

        //pyramid FOR
        System.out.println();
        int[] arr = {10, 20, 30, 40};
        for (int i=0; i<arr.length;i++){
            for (int y=0; y<=i; y++){
                System.out.print(arr[y]+ " ");
            }
            System.out.println();
        }

    }


}
