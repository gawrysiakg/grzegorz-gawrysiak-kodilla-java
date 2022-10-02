package com.kodilla.good.patterns.challenges.Flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightSearchService {

    Set<Flight> listOfFlights;

    public FlightSearchService(Set<Flight> listOfFlights){
        this.listOfFlights = listOfFlights;
    }


    public Set<Flight> searchFlightFromTo(String from, String to) {

        Set<Flight> result = listOfFlights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(from))
                .filter(flight -> flight.getArrivalAirport().equals(to))
                .collect(Collectors.toSet());
        return result;
    }

    public Set<Flight> searchAllFlightsFrom(String from) {

        Set<Flight> result = listOfFlights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(from))
                .collect(Collectors.toSet());
        return result;
    }


    public Set<Flight> searchAllFlightsTo(String to) {

        Set<Flight> result = listOfFlights.stream()
                .filter(flight -> flight.getArrivalAirport().equals(to))
                .collect(Collectors.toSet());
        return result;
    }


    public List<Flight> searchFlightViaOtherCity(String from, String to) {

        Set<Flight> flightsFrom = listOfFlights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(from))
                .collect(Collectors.toSet());

        Set<Flight> flightsTo = listOfFlights.stream()
                .filter(flight -> flight.getArrivalAirport().equals(to))
                .collect(Collectors.toSet());

        List<Flight> viaCity = new ArrayList<>();
        for (Flight f : flightsFrom){
            for (Flight t : flightsTo){
                if (f.getArrivalAirport().equals(t.getDepartureAirport())){
                 viaCity.add(f);
                 viaCity.add(t);
                }
            }
        } return viaCity;
    }

    public Set <Flight> searchFlightViaOtherCity(String from, String to, String via) {

        Set<Flight> flightsFromVia = listOfFlights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(from))
                .filter(flight -> flight.getArrivalAirport().equals(via))
                .collect(Collectors.toSet());

        Set<Flight> flightsViaTo = listOfFlights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(via))
                .filter(flight -> flight.getArrivalAirport().equals(to))
                .collect(Collectors.toSet());

        return Stream.concat(flightsFromVia.stream(), flightsViaTo.stream())
                .collect(Collectors.toSet());
    }




}
