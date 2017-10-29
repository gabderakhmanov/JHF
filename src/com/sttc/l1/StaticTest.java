package com.sttc.l1;

public class StaticTest {

    static int age;
    static String name;

    static {
        age = 33;
        name = "name";
    }

    static double sal(int o){
        return 2.0+o;
    }

    double sizeOf(){
        return 3.0;
    }


}
