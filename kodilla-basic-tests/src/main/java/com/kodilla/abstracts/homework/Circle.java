package com.kodilla.abstracts.homework;

public class Circle extends Shape{

    public Circle() { super(1); }

    @Override
    public void surfaceArea() {
        double r = 2;
        double PI = 3.1415927;
        double result = PI*(r*r);
        System.out.println("Pole kola: " + result);
    }

    @Override
    public void circuit() {
        double r = 2;
        double PI = 3.1415927;
        double result = 2 * PI * r;
        System.out.println("Obwod kola: " + result);
    }
}
