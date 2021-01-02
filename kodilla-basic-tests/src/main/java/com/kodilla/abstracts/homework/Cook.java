package com.kodilla.abstracts.homework;

public class Cook extends Job{
    public Cook() {
        super(3500);
    }

    @Override
    public void responsibilities() {
        System.out.println("Obowiazki kucharza: gotowanie potraw, tworzenie  menu.");
    }
}
