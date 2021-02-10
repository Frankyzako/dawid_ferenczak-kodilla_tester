package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        try {
            boolean IsViennaInUse = airportRepository.isAirportsUse("Vienna");
            System.out.println("Vienna status: "+ IsViennaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry, this airport cannot be served by our airlines. ");
        }finally {
            System.out.println("Thank you for using Kodilla Airlines.");
        }
    }
}
