package com.intrfc.l1;

public class Circle implements Shape {

    private double rad;

    public Circle(double rad){
        this.rad = rad;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(rad, 2);
    }

    @Override
    public double perimeter() {
        return 2* Math.PI * rad;
    }
}
