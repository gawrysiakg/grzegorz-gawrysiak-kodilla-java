package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchEngine {

    boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flights = new HashMap<>();
        flights.put("London", true);
        flights.put("Warsaw", true);
        flights.put("Buenos Aires", false);
        flights.put("New York", false);
        flights.put("Berlin", true);
        flights.put("Chicago", true);
        String destAirport = flight.arrivalAirport;
        boolean searchStatus;

        if (flights.containsKey(destAirport)) {
            searchStatus = flights.get(destAirport);
            if (searchStatus){
                System.out.println("Flight to " + destAirport + " is available.");
            } else {
                System.out.println("Flight to " + destAirport + " is unavailable.");
            }
        } else {
            throw new RouteNotFoundException(" "+destAirport + " not found in database");
        }
        return searchStatus;
    }


    public static void main(String[] args) {

        Flight flight1 = new Flight("Paris", "London");
        Flight flight2 = new Flight("London", "New York");
        Flight flight3 = new Flight("Berlin", "Warsaw");
        Flight flight4 = new Flight("Warsaw", "Chile");

        FlightSearchEngine searchEngine = new FlightSearchEngine();

        try {
            searchEngine.findFlight(flight1);
        } catch (RouteNotFoundException r) {
            System.out.println("Error: " +r);
        }

        try {
            searchEngine.findFlight(flight2);
        } catch (RouteNotFoundException r) {
            System.out.println("Error: " +r);
        }

        try {
            searchEngine.findFlight(flight4);
        } catch (RouteNotFoundException r) {
            System.out.println("Error: " +r);
        }

        try {
            searchEngine.findFlight(flight3);
        } catch (RouteNotFoundException r) {
            System.out.println("Error: " +r);
        }

    }
}