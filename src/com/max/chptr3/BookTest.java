package com.max.chptr3;

class BookTest {

    static class Books {
        String title;
        String author;
    }

    static class BookTestDrive{
        public static void main(String[] args) {

            Books[] book = new Books[2];

            // err - need to create obj for each link
            book[0] = new Books();
            book[1] = new Books();
            //

            book[0].title = "t0";
            book[0].author = "a0";

            book[1].title = "t1";
            book[1].author = "a1";

            int x=0;
            while (x < book.length){
                System.out.println("t=" + book[x].title);
                System.out.println("a=" + book[x].author);
                x++;
            }
        }
    }

}
