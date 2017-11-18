package com.abstrct.l3;

public class HshTestOfImmutable {

    public static void main(String[] args){

        HshTestOfImmutable hshTestOfImmutable = new HshTestOfImmutable();
        hshTestOfImmutable.strTest();

        hshTestOfImmutable.intTest();

        hshTestOfImmutable.eqlTest();

    }


    private void strTest(){

        String str = "knowlege";
        System.out.println("str before:" + str.hashCode());

        str = str.concat("base");
        System.out.println("str after:" + str.hashCode());

        System.out.println(str);
    }

    private void intTest(){

//        Integer i = 5;
//        System.out.println("i before:" + i.hashCode());
//
//        i = i + 5 ;
//        System.out.println("i before:" + i.hashCode());
//
//        System.out.println(i);
    }

    private void eqlTest(){

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));


        Integer i = new Integer(5);
        Integer t = new Integer(5);

        System.out.println(i == t);
        System.out.println(i.equals(t));



        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));

    }

}
