package com.kodilla.good.patterns.challenges.Flights;

import java.util.Objects;

public class Flight {
    private String departureAirport;
    private String arrivalAirport;
    private int flightNumber;


    public Flight(final String departureAirport, final String arrivalAirport, final int flightNumber) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.flightNumber = flightNumber;
    }


    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    @Override
    public String toString() {
        return "Flight " +
                "From: '" + departureAirport + '\'' +
                ", To: '" + arrivalAirport + '\'' +
                ", Flight number: " + flightNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightNumber == flight.flightNumber && departureAirport.equals(flight.departureAirport) && arrivalAirport.equals(flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, arrivalAirport, flightNumber);
    }
}
