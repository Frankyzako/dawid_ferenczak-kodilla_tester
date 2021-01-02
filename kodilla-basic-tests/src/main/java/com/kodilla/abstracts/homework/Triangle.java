package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    public Triangle() {
        super(3);
    }

    @Override
    public void surfaceArea() {
        double a = 3;
        double h = 1;
        double result = (a * h)/2;
        System.out.println("Pole trojkata: " + result);
    }

    @Override
    public void circuit() {
        double a = 3;
        double b = 4;
        double c = 4;
        double result = a + b + c;
        System.out.println("0bwod trojkata: " + result);

    }
}
