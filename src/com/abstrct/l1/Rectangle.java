package com.abstrct.l1;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    double square() {
        return width * height;
    }

    @Override
    double perimeter() {
        return (width + height) * 2;
    }
}
