package com.max.chptr3;

public class InterfaceApp {
    public static void main(String[] args) {
        Book book = new Book();
        book.getTitle();
        book.getAuthor();
        System.out.println("value from interface: "+I.i);
    }

interface I{
    //has static final value
    int i = 5;

    //has method to implement
    void getTitle();

    //has default method, we can override this (from v1.7)
    default void getAuthor(){
        System.out.println("This is author");
    }
}

static class Book implements I {

    @Override
    public void getTitle() {
        System.out.println("This is title");
    }

}


}
