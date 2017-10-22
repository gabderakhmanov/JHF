package com.glvch.l1;


public class IncrementDecrementTest {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        int res = (++a + b--) + (a++ + b--) * (--a + ++b) + a++ - a-- - --b;

        // (3  + 3 ) + (3   + 2  ) * (3 + 2)      + 3   - 4 - 1;

        System.out.println(res);


    }

}
