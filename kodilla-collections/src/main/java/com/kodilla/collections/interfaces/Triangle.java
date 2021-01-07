package com.kodilla.collections.interfaces;

public class Triangle implements Shape {

    double width;
    double height;
    double hypotenuse;
    public Triangle(double width, double height, double hypotenuse) {
        this.height = height;
        this.width = width;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return (height*width)/2;
    }

    @Override
    public double getPerimeter() {
        return height+hypotenuse+width;
    }
}
