package com.max.chptr3;


public class AppAbstract {

    public static void main(String[] args) {
        Shape square = new Square();
        square.area();
        System.out.println(square.color());
    }

    static abstract class Shape{
        abstract void area();

        String color(){
            return "Green";
        }
    }

    static class Square extends Shape{

        @Override
        void area() {
            System.out.println("area = 3");
        }
    }
}
