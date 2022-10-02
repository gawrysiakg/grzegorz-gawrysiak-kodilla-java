package com.kodilla.good.patterns.challenges.Flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsDatabase {

    private Set<Flight> listOfFlights = new HashSet<>();

    public void initFlightsDatabase() {
        listOfFlights.add(new Flight("WARSZAWA", "WROCLAW", 45887));
        listOfFlights.add(new Flight("WARSZAWA", "WROCLAW", 95887));
        listOfFlights.add(new Flight("WARSZAWA", "GDANSK", 22475));
        listOfFlights.add(new Flight("WARSZAWA", "GDANSK", 29985));
        listOfFlights.add(new Flight("WROCLAW", "WARSZAWA", 10021));
        listOfFlights.add(new Flight("WARSZAWA", "POZNAN", 11407));
        listOfFlights.add(new Flight("WARSZAWA", "KRAKOW", 12410));
        listOfFlights.add(new Flight("WROCLAW", "POZNAN", 21005));
        listOfFlights.add(new Flight("WROCLAW", "POZNAN", 23005));
        listOfFlights.add(new Flight("WROCLAW", "GDANSK", 31050));
        listOfFlights.add(new Flight("GDANSK", "WROCLAW", 03350));
        listOfFlights.add(new Flight("WROCLAW", "RADOM", 33750));
        listOfFlights.add(new Flight("POZNAN", "KRAKOW", 33979));
        listOfFlights.add(new Flight("POZNAN", "KRAKOW", 34979));
        listOfFlights.add(new Flight("RADOM", "GDANSK", 40120));
        listOfFlights.add(new Flight("SZCZECIN", "WARSZAWA", 41570));
        listOfFlights.add(new Flight("KRAKOW", "SZCZECIN", 47505));
        listOfFlights.add(new Flight("POZNAN", "WARSZAWA", 49447));
        listOfFlights.add(new Flight("SZCZECIN", "POZNAN", 50055));
        listOfFlights.add(new Flight("GDANSK", "POZNAN", 50100));
        listOfFlights.add(new Flight("GDANSK", "WARSZAWA", 52500));
        listOfFlights.add(new Flight("GDANSK", "WARSZAWA", 53500));
        listOfFlights.add(new Flight("WROCLAW", "BYDGOSZCZ", 58088));
        listOfFlights.add(new Flight("BYDGOSZCZ", "POZNAN", 63500));
        listOfFlights.add(new Flight("POZNAN", "BYDGOSZCZ", 60050));
        listOfFlights.add(new Flight("POZNAN", "GDANSK", 99050));

    }

    public Set<Flight> getListOfFlights() {
        return listOfFlights;
    }

    public void addFlight(Flight flight) {
        listOfFlights.add(flight);
    }

    public void deleteFlight(Flight flight) {
        listOfFlights.remove(flight);
    }


    @Override
    public String toString() {
        return "FlightsDatabase{" +
                "listOfFlights=" + listOfFlights +
                '}';
    }
}
