package com.kodilla.abstracts.homework;

public class Square extends Shape{
    public Square() { super(4); }

    @Override
    public void surfaceArea() {
        double a = 6;
        double result = a*a;
        System.out.println("Pole kwadratu: " + result);
    }

    @Override
    public void circuit() {
        double a = 6;
        double result = a*getNumberOfWalls();
        System.out.println("0bwod trojkata: " + result);
    }
}
