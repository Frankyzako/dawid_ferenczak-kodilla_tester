package com.kodilla.abstracts.homework;

public class ApplicationJob {
    public static void main(String[] args) {

        Job cook = new Cook();
        Person dawid = new Person("Dawid",30 );
        dawid.process(cook);

        Job pilot = new Pilot();
        Person marek = new Person("Marek",43 );
        marek.process(pilot);

        Job doctor = new Doctor();
        Person wiesiek = new Person("Wiesiek",55 );
        wiesiek.process(doctor);



    }
}
