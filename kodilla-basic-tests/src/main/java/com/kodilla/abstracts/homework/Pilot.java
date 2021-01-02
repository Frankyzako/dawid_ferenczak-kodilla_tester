package com.kodilla.abstracts.homework;

public class Pilot extends Job{
    public Pilot() {
        super(6000);
    }

    @Override
    public void responsibilities() {
        System.out.println("Obowiazki pilota: sprawdzanie, czy załoga jest przygotowana do lotu.\n przygotowanie listy z liczbą pasażerów.\n nadzorowanie sytuacji na pokładzie samolotu.\n odpowiadanie za działania podejmowane przez załogę oraz za bezpieczeństwo pasażerów.");
    }
}
