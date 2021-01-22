package com.kodilla.collections.adv.immutable.special.homework;



public class BookApplication {
    public static void main(String[] args) {

        Book potop = BookManager.createBook("Potop", "Sienkiewicz");
        Book ow = BookManager.createBook("Opowiesc wigilijna", "Dickens");
        Book lalka = BookManager.createBook("Laka", "Prus");
        System.out.println(potop==ow);
        System.out.println(potop==lalka);
        System.out.println(lalka==ow);
        System.out.println(potop==potop);


    }
}
