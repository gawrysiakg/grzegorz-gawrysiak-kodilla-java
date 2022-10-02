package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {

        FlightsDatabase flightsDatabase = new FlightsDatabase();
        flightsDatabase.initFlightsDatabase();
        FlightSearchService flightSearchService = new FlightSearchService(flightsDatabase.getListOfFlights());


        Set<Flight> fromTo = flightSearchService.searchFlightFromTo("WARSZAWA", "GDANSK");
        System.out.println(fromTo);

        Set<Flight> flightFrom = flightSearchService.searchAllFlightsFrom("WARSZAWA");
        System.out.println(flightFrom);

        Set<Flight> flightTo = flightSearchService.searchAllFlightsTo("GDANSK");
        System.out.println(flightTo);


        List<Flight> flightVia = flightSearchService.searchFlightViaOtherCity("WARSZAWA", "GDANSK");
        System.out.println(flightVia);

        Set<Flight> flightFromToVia = flightSearchService.searchFlightViaOtherCity("WARSZAWA", "GDANSK", "WROCLAW");
        System.out.println(flightFromToVia);
    }
}
