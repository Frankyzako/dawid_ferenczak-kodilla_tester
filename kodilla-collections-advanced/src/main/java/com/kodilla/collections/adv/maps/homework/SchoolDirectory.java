package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();

        Principal albus = new Principal("Albus", "Dumbledore");
        Principal wiesiek = new Principal("Wiesiek", "Porkman");
        Principal mietek = new Principal("Mietek", "Habsburg");

        School albusSchool = new School("Hogwart", 32,31, 30,34,32,34,35,29);
        School wiesiekSchool = new School("Gimnazjum nr 2", 31,28,32,30,30);
        School mietekSchool = new School("Oxford", 43,42,52,42,54,52,39,40,43,45,38,44);

        school.put(albus, albusSchool);
        school.put(wiesiek, wiesiekSchool);
        school.put(mietek, mietekSchool);

        for (Map.Entry<Principal, School> schoolEntry : school.entrySet()){
            System.out.println("Dyrektor: "+schoolEntry.getKey()+".\n " +
                    "Nazwa szkoły, liczba klas i liczba uczniów w klasach:  "+ schoolEntry.getValue()+".\n " +
                    "Ilosc uczniów w danej szkole: "+schoolEntry.getValue().getStudents());
        }
    }
}
