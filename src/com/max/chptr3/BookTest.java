package com.max.chptr3;

public class BookTest {

    static class Books {
        String title;
        String author;
    }

    static class BookTestDrive{
        public static void main(String[] args) {
            Books[] myBooks = new Books[2];
            int x =0;

            //need to create objects
            myBooks[0] = new Books();
            myBooks[1] = new Books();
            //

            myBooks[0].title = "BT1";
            myBooks[0].author = "BA1";

            myBooks[1].title = "BT2";
            myBooks[1].author = "BA2";

            while (x<myBooks.length){
                System.out.println("title=" + myBooks[x].title);
                System.out.println("author=" + myBooks[x].author);
                x++;
            }

        }

    }

}
