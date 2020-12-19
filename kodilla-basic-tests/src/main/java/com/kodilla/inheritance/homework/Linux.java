package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem{

    public Linux(int yearOfPublish) {
        super(yearOfPublish);
    }

    @Override
    public void turnOn() {

        System.out.println("System Linux turn on");
    }
    @Override
    public void turnOf() {

        System.out.println("System Linux turn of");
    }
    public void displayYearOfLinux() {
        System.out.println("linux was published in: " + yearOfPublish);
    }
}
