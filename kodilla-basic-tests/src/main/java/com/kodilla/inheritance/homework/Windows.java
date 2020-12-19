package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int yearOfPublish) {
        super(yearOfPublish);
    }

    @Override
    public void turnOn() {

        System.out.println("System Windows turn on");
    }
    @Override
    public void turnOf() {

        System.out.println("System Windows turn of");
    }

    public void displayYearOfWindows() {
        System.out.println("Windows was published in: " + yearOfPublish);
    }
}
