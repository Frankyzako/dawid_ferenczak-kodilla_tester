package com.kodilla.abstracts.homework;

public class ShapeProcessor {
    public void process(Shape shape) {
        System.out.println("Shape has " + shape.getNumberOfWalls() + " walls");
        shape.surfaceArea();
        shape.circuit();
    }
}
