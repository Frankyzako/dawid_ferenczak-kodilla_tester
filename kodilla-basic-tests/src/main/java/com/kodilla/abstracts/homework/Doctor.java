package com.kodilla.abstracts.homework;

public class Doctor extends Job{
    public Doctor() {
        super(5000);
    }

    @Override
    public void responsibilities() {
        System.out.println("Obowiazki lekarza: ma obowiązek udzielić pomocy lekarskiej w każdym przypadku");
    }
}
