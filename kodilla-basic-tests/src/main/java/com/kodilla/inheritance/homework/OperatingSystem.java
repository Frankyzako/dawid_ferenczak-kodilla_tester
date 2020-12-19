package com.kodilla.inheritance.homework;

public class OperatingSystem {


    int yearOfPublish;

    public OperatingSystem(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }
    public int getYearOfPublish() {
        return yearOfPublish;
    }


    public void turnOn() {

        System.out.println("System turn on");
    }
    public void turnOf() {

        System.out.println("System turn of");
    }

}
