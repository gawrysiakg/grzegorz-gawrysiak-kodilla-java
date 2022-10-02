package com.kodilla.good.patterns.challenges.Flights;

import com.sun.source.tree.IfTree;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearchService {

    Set<Flight> listOfFlights;

    public FlightSearchService(Set<Flight> listOfFlights){
        this.listOfFlights = listOfFlights;
    }


public void searchFlightFromTo(String from, String to) {
    System.out.println("\u001B[34m"+"\nAll flights from "+from+" to "+to+":"+"\u001B[0m");
        Set<Flight> result = listOfFlights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(from))
                .filter(flight -> flight.getArrivalAirport().equals(to))
                .collect(Collectors.toSet());
        if(result.size()>0){
            result.stream().forEach(System.out::println);
        } else {
            System.out.println("Not found any flight");
        }

}

    public void searchAllFlightsFrom(String from) {
        System.out.println("\u001B[34m"+"\nAll flights from "+from+":"+"\u001B[0m");

        Set<Flight> result = listOfFlights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(from))
                .collect(Collectors.toSet());
        if(result.size()>0){
            result.stream().forEach(System.out::println);
        } else {
            System.out.println("Not found any flight");
        }
    }


    public void searchAllFlightsTo(String to) {
        System.out.println("\u001B[34m"+"\nAll flights to "+to+":"+"\u001B[0m");

        Set<Flight> result = listOfFlights.stream()
                .filter(flight -> flight.getArrivalAirport().equals(to))
                .collect(Collectors.toSet());
        if(result.size()>0){
            result.stream().forEach(System.out::println);
        } else {
            System.out.println("Not found any flight");
        }
    }


    public void searchFlightViaOtherCity(String from, String to) {

        Set<Flight> flightsFrom = listOfFlights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(from))
                .collect(Collectors.toSet());

        Set<Flight> flightsTo = listOfFlights.stream()
                .filter(flight -> flight.getArrivalAirport().equals(to))
                .collect(Collectors.toSet());

        int foundVia=0;
        for (Flight f : flightsFrom){
            for (Flight t : flightsTo){
                if (f.getArrivalAirport().equals(t.getDepartureAirport())){
                    System.out.println("\u001B[34m"+"\nFlight form "+f.getDepartureAirport()+" to "
                            +t.getArrivalAirport()+" with stopover in "+t.getDepartureAirport()+":"+"\u001B[0m");
                    System.out.println(f);
                    System.out.println(t);
                    foundVia++;
                }
            }
        }
        if(foundVia==0){
            System.out.println("\nFlight from "+from+" to "+to+" not found");
        }
    }






}
