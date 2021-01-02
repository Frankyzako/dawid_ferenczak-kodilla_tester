package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int numberOfWalls;

    public Shape(int numberOfWalls) {
        this.numberOfWalls = numberOfWalls;
    }

    public int getNumberOfWalls() {
        return numberOfWalls;
    }


    public abstract void surfaceArea();

    public abstract void circuit();

}