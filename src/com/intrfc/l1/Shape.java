package com.intrfc.l1;

public interface Shape {

    default String type(){
        return "Shape";
    }

    public double square();

    public double perimeter();

}
