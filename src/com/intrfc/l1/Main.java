package com.intrfc.l1;

public class Main {

    public static void main(String[] args) {

        Shape sp = new Rectangle(23.1, 33.1);
        System.out.println(sp.perimeter() + "|" + sp.square() );

        Shape sps = new Circle(22.9);
        System.out.println(sps.perimeter() + "|" + sps.square());

    }

}
