package com.kodilla.stream.world;

import java.util.List;


public final class Continent {
    private final List<Country> listOfCountries;
    private final String continentName;

    public Continent(String continentName, List<Country> listOfCountries) {
        this.listOfCountries = listOfCountries;
        this.continentName = continentName;
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }

    public String getContinentName() {
        return continentName;
    }
}
