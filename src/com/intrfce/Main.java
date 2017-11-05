package com.intrfce;

public class Main {


    public static void main(String[] args) {

        String txt4Read = "Text for read";

        IReader reader = new Reader();
        String strFromReader = reader.read(txt4Read);

        IPrinter printer = new Printer();
        String strFromrprinter = printer.print(strFromReader);

        System.out.println(strFromrprinter);
    }

}
