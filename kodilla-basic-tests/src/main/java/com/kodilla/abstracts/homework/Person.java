package com.kodilla.abstracts.homework;

public class Person {


    String firstName;
    int age;
    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
        System.out.println("Imie: "+ firstName+", wiek: "+ age);
    }



    public void process(Job job) {
        System.out.println("Wynagrodzenie wynosi: " + job.getSalary() + " złotych brutto");
        job.responsibilities();

    }
}