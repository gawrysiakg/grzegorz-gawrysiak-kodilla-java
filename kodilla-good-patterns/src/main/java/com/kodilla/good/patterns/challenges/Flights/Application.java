package com.kodilla.good.patterns.challenges.Flights;

public class Application {
    public static void main(String[] args) {

        FlightsDatabase flightsDatabase = new FlightsDatabase();
        flightsDatabase.initFlightsDatabase();
        FlightSearchService flightSearchService = new FlightSearchService(flightsDatabase.getListOfFlights());


        flightSearchService.searchFlightFromTo("WARSZAWA", "GDANSK");

        flightSearchService.searchAllFlightsFrom("WARSZAWA");

        flightSearchService.searchAllFlightsTo("GDANSK");

        flightSearchService.searchFlightViaOtherCity("WARSZAWA", "GDANSK");

    }
}
