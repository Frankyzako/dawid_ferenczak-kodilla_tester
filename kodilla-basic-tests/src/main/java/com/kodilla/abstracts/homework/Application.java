package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Shape square = new Square();
        ShapeProcessor processor1 = new ShapeProcessor();
        processor1.process(square);

        Shape circle = new Circle();
        ShapeProcessor processor2 = new ShapeProcessor();
        processor2.process(circle);

        Shape triangle = new Triangle();
        ShapeProcessor processor3 = new ShapeProcessor();
        processor3.process(triangle);

    }
}
