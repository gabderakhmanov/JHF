package com.glvch.l1;

import java.util.Arrays;

public class SystemArrayCopyTest {

    public static void main(String[] args) {

        int[] arrFrst = {10,20,30,40,50,60,70,80,90};

        int[] arrScnd = {100,200,300,400,500,600,700,800,900};

        System.arraycopy(arrFrst, 3, arrScnd, 2, 5);

        System.out.println(Arrays.toString(arrFrst));
    }

}
