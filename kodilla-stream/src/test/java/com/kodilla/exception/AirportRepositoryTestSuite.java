package com.kodilla.exception;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


class AirportRepositoryTestSuite {

    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportsUse("Warsaw");
        // then
        assertTrue(isWarsawInUse);
    }
    @Test(expected = AirportNotFoundException.class)
    public void testIsAirportInUse_withException() throws AirportNotFoundException {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportsUse("Vienna");
        // then
        assertFalse(isWarsawInUse);
    }

}