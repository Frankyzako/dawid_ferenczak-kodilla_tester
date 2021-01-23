package com.kodilla.collections.adv.exercises.homework;


import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    static List<Flight> flights = new ArrayList<Flight>();

    public static List<Flight> getFlightsTable(){
        flights.add(new Flight("londyn", "Paryż"));
        flights.add(new Flight("rzym", "londyn"));
        flights.add(new Flight("londyn", "rzym"));
        flights.add(new Flight("moskwa", "Paryż"));
      return flights;
    }
}
